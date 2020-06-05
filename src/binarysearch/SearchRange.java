package binarysearch;

import java.util.Arrays;

public class SearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                int temp = mid;
                while(temp >= 0 && nums[temp] == target) {
                    temp--;
                }
                result[0] = temp + 1;
                temp = mid;
                while (temp < nums.length && nums[temp] == target) {
                    temp++;
                }
                result[1] = temp -1;
                return result;
            }else if (nums[mid] < target) {
                i = mid + 1;
            }else if (nums[mid] > target) {
                j = mid - 1;
            }
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
