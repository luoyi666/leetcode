package arrayandmatrix;

public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c) return  nums;
        int orow = 0;
        int ocol = 0;
        int nrow = r;
        int ncol = c;
        int[][] newMatrix = new int[r][c];
        while (orow < nums.length && nrow < r) {
            newMatrix[nrow][ncol] = nums[orow][ocol];
            if (ncol == c) {
                nrow++;
                ncol = 0;
            }else {
                ncol++;
            }
            if (ocol == nums[0].length) {
                orow++;
                ocol = 0;
            }else {
                ocol++;
            }
        }
        return newMatrix;
    }
}
