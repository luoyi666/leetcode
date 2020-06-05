package string;

import java.util.Arrays;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        int[] chars = new int[128];
        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i)] == 0) {
                chars[s.charAt(i)] = t.charAt(i);
            }else {
                if (chars[s.charAt(i)] != t.charAt(i))
                    return false;
            }
        }
        return true;
    }
}
