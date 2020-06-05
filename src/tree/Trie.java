package tree;

class Trie {
    class TrieNode {
        boolean isEnd;
        TrieNode[] next;
    }
    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root.next = new TrieNode[26];
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        if (word == null) return;
        TrieNode node = root;
        int index = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            index = word.charAt(i) - 'a';
            if (node.next[index] == null) {
                node.next[index] = new TrieNode();
                node.isEnd = false;
            }
            node = node.next[index];
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if (word == null) return false;
        TrieNode node = root;
        int index = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            index = word.charAt(i) - 'a';
            if (node.next[index] == null) {
                return false;
            }
            node = node.next[index];
        }
        if (node.isEnd) {
            return true;
        }else {
            return false;
        }
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        boolean flag = false;
        for (int i = 0; i < root.next.length - 1; i++) {
            if (root.next[i] != null) return true;
        }
        if (flag == false) return false;
        if (prefix == null) return true;
        TrieNode node = root;
        int index = 0;
        for (int i = 0; i < prefix.length() - 1; i++) {
            index = prefix.charAt(i) - 'a';
            if (node.next[index] == null) {
                return false;
            }
            node = node.next[index];
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("sdfs".startsWith(null));
    }
}