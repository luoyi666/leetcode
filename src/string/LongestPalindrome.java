package string;

import java.util.Collection;
import java.util.HashMap;

public class LongestPalindrome {
    public  static int longestPalindrome(String s) {
        if (s == null || s.length() ==0 )return 0;
        int sum = 0;
        int[] chars = new int[52];
        for (char c : s.toCharArray()) {
            chars[c]++;
        }
        for (int charLen : chars) {
            sum += (charLen / 2) * 2;
        }
        if (sum < s.length()) {
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
