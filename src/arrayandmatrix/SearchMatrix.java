package arrayandmatrix;

public class SearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }else if (matrix[i][j] > target){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{-5}};
        System.out.println( searchMatrix(matrix, -5));
    }
}
