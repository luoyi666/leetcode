package doublepointer;

public class JudgeSquareSum {
    public static boolean judgeSquareSum(int c) {
        if(c == 0 || c == 1) {
            return true;
        }
        int j = (int)Math.floor(Math.sqrt(c));
        int i = 0;
        while(i <= j){
            int sum = i*i + j*j;
            if(sum < c){
                i++;
            }else if(sum > c){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println( judgeSquareSum(8));;
    }
}
