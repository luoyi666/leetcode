package tree;

import java.util.HashMap;

public class MapSum {
    class TrieNode {
        int path;
        boolean isEnd = false;
        TrieNode[] next = new TrieNode[26];
    }
    TrieNode root;
    HashMap<String, Integer> hashMap;
    /** Initialize your data structure here. */
    public MapSum() {
        root = new TrieNode();
        hashMap = new HashMap<String, Integer>();
    }

    public void insert(String key, int val) {
        if (key == null) return;
        TrieNode node = root;
        boolean flag = hashMap.containsKey(key);
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (node.next[index] == null) {
                node.next[index] = new TrieNode();
            }else {
                node.next[index].path -= hashMap.get(key);
            }
            node = node.next[index];
            node.path += val;
        }
        hashMap.put(key, val);
    }

    public int sum(String prefix) {
        if (root == null) return 0;
        if (prefix.length() == 0) return 0;
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (node.next[index] == null) {
                return 0;
            }
            node = node.next[index];
        }
        return node.path;
    }
}
