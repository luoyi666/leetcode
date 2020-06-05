package greedy;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static List<Integer> partitionLabels(String S) {
        List<Integer> ans = new ArrayList<Integer>();
        int[] dic = new int[26];
        for (int i = 0; i < S.length(); i++) {
            dic[S.charAt(i) - 'a'] = i;
        }
        int i = 0, j = 0;
        for (int k = 0; k < S.length(); k++) {
            j = Math.max(j, dic[S.charAt(k) - 'a']);
            if (k == j) {
                ans.add(j - i + 1);
                i = j + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }
}
