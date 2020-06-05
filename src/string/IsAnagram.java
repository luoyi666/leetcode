package string;

import java.util.HashMap;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || t.length() == 0 || s.length() == 0) return false;
        HashMap<String, Integer> hashMapS = new HashMap<String, Integer>();
        HashMap<String, Integer> hashMapT = new HashMap<String, Integer>();
        for (int i = 0; i < s.length(); i++) {
            hashMapS.put(s.charAt(i)+"", hashMapS.getOrDefault(s.charAt(i)+"", 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            hashMapT.put(t.charAt(i)+"", hashMapT.getOrDefault(t.charAt(i)+"", 0)+1);
        }
        return hashMapS.equals(hashMapT);
    }
    public boolean isAnagram2(String s, String t) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            chars[t.charAt(i) - 'a']--;
        }
        for (int aChar : chars) {
            if (aChar != 0) {
                return false;
            }
        }
        return true;
    }
}
