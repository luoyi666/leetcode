package greedy;

public class CheckPossibility {
    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length && count < 2; i++) {
            if (nums[i] < nums[i - 1]) {
                if (i >= 2 && nums[i] < nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }else {
                    nums[i - 1] = nums[i];
                }
                count++;
            }
        }
        return count<=1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,3,2,4};
        System.out.println( checkPossibility(nums));
    }
}
