package string;

public class CountSubstrings {
    public int countSubstrings(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (isPalindrome(chars, i, j)) {
                    sum++;
                }
            }
        }
        return sum;
    }
    public boolean isPalindrome(char[] arr, int left, int right) {
        while (left < right) {
            if (arr[left] == arr[right]) {
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
}
