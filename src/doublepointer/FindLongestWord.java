package doublepointer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindLongestWord {
    public String findLongestWord(String s, List<String> d) {
        Collections.sort(d, new SortByLengthComparator());
        String longestWord = "";
        for (String target : d) {
            int l1 = longestWord.length();
            int l2 = target.length();
            if(l1 > l2 || (l1 == l2 && longestWord.compareTo(target) < 0)){
                continue;
            }
            if(strEquel(s, target)){
                longestWord = target;
            }
        }
        return longestWord;
    }
    public boolean strEquel(String s, String target){
        int i = 0, j = 0;
        while(i < s.length() && j < target.length()){
            if(s.charAt(i) == target.charAt(j)){
                j++;
            }
            i++;
        }
        return j == target.length();
    }

    public class SortByLengthComparator implements Comparator<String> {

        @Override
        public int compare(String var1, String var2) {
            if (var1.length() > var2.length()) {
                return 1;
            } else if (var1.length() == var2.length()) {
                return 0;
            } else {
                return -1;
            }
        }

    }
}
