package doublepointer;

public class ValidPalindrome {
    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int count = 0;
        while(i < j){
            if(count > 1){
                return false;
            }
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }else {
                if(i + 2 < j - 1){
                    if(s.charAt(i+1) == s.charAt(j) && s.charAt(i+2) == s.charAt(j - 1)){
                        i++;
                    }else if(s.charAt(i) == s.charAt(j - 1) && s.charAt(i + 1) == s.charAt(j - 2)){
                        j--;
                    }
                    count++;
                }else {
                    if(s.charAt(i+1) == s.charAt(j)){
                        i++;
                    }else if(s.charAt(i) == s.charAt(j - 1)){
                        j--;
                    }
                    count++;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
        System.out.println(validPalindrome("abca"));
    }
}
