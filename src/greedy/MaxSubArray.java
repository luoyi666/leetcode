package greedy;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int curMax = nums[0];
        int preSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            preSum = preSum > 0 ? preSum + nums[i] : nums[i];
            curMax = Math.max(curMax, preSum);
        }
        return curMax;
    }
}
