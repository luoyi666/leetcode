package doublepointer;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 1;
        int index2 = 2;
        int[] result = {index1, index2};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] <= target){
                    if(numbers[i] + numbers[j] == target){
                        result[0] = i + 1;
                        result[1] = j + 1;
                        return result;
                    }
                }else {
                    break;
                }
            }
        }
        return result;
    }
    public static int[] twoSum2(int[] numbers, int target) {
        int i = 1;
        int j = numbers.length - 1;
        int[] result = {i, j};
        while (i < j) {
            if(numbers[i] + numbers[j] > target) {
                j--;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else {
                break;
            }
        }
        result[0] = i + 1;
        result[1] = j + 1;
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        twoSum2(numbers, 9);
    }
}
