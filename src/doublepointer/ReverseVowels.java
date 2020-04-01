package doublepointer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        if(s == null || s.length() == 0){
            return null;
        }
        List<Character> words = Arrays.asList('a','A','e','E','i','I','o','O','u','U');
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while(i < j){
            if(words.contains(chars[i]) && words.contains(chars[j])) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }else if(words.contains(chars[i]) && !words.contains(chars[j])){
                j--;
            }else if(!words.contains(chars[i]) && words.contains(chars[j])){
                i++;
            }else {
                i++;
                j--;
            }
        }
        String result = String.valueOf(chars);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
