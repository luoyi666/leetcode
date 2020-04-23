package greedy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class EraseOverlapIntervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int sum = 0;
        int count = 1;
        for (int i = 0; i < intervals.length; i++) {
            if(i == 0) {
                sum++;
                continue;
            }
            if(intervals[i][0] >= intervals[i - count][1]) {
                sum++;
                count = 1;
            }else {
                count++;
            }
        }
        return intervals.length - sum;
    }

    public static void main(String[] args) {
        int[][] internals = {{0,1},{3,4},{1,2}};
        System.out.println(eraseOverlapIntervals(internals));
    }
}
