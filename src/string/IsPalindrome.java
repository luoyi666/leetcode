package string;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = Integer.toString(x);
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome2(int x) {
        if (x == 0) return true;
       if (x < 0 || x % 10 == 0) return false;
       int temp = 0;
       while (x > temp) {
           temp = temp * 10 + x % 10;
           x = x /10;
       }
       return x == temp || x == temp / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2(0));
    }
}
