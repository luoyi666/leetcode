package arrayandmatrix;

import java.util.Arrays;

public class KthSmallest {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
        int min = matrix[0][0];
        int secondMin = 0;
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while (k != 0) {

        }
    }
    public int[] findSecondMin(int left, int right, int min) {
        int[] secondMin = {left, right, min};
        Arrays.sort(secondMin);
        return secondMin;
    }
}
