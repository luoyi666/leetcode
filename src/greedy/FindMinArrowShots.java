package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FindMinArrowShots {
    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] point1, int[] point2) {
                if (point1[1] != point2[1]) {
                    return point1[1] - point2[1];
                }
                return point1[0] - point2[0];
            }
        });
        int sum = 1;
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if(end >= points[i][0]) {
                continue;
            }
            sum++;
            end = points[i][1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] internals = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(internals));
    }
}
