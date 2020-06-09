package arrayandmatrix;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (i == nums.length - countZero) return;
                for (int j = i ; j < nums.length - 1; j++) {
                    nums[j] = nums[j+1];
                }
                nums[nums.length - 1] = 0;
                countZero++;
                i = i - 1;
            }
        }
    }
    public static void moveZeroes2(int[] nums) {
        int fast = 0;
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                slow = i;
                fast = i;
                while (nums[fast] == 0) {
                    fast++;
                }
                nums[slow] = nums[fast];
                nums[fast] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num+",");
        }
    }
}
