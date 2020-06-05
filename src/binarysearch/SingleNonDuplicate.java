package binarysearch;

public class SingleNonDuplicate {
    public static int singleNonDuplicate(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (mid > 0 && mid < nums.length - 1) {
                if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                    return nums[mid];
                }else if (nums[mid] == nums[mid - 1] && mid % 2 == 0) {
                    j = mid - 1;
                }else if (nums[mid] == nums[mid - 1] && mid % 2 != 0) {
                    i = mid + 1;
                }else if (nums[mid] == nums[mid + 1] && mid % 2 != 0) {
                    j = mid - 1;
                }else if (nums[mid] == nums[mid + 1] && mid % 2 == 0) {
                    i = mid + 1;
                }
            }else {
                return nums[j];
            }
        }
        return nums[j];
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
}
