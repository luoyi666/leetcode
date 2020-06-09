package string;

public class CountBinarySubstrings {
    public static int countBinarySubstrings(String s) {
        int cur = 1;
        int pre = 0;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                cur++;
            }else {
                pre = cur;
                cur = 1;
            }
            if (pre >= cur) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        countBinarySubstrings("10110011001011");
    }
}
