package hashmap;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Integer[] num = set.toArray(new Integer[]{});
        Arrays.sort(num);
        int max = 1;
        int count = 1;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] + 1 == num[i + 1]) {
                count++;
            }
            if (count > max) {
                max = count;
            }
            if (num[i] + 1 != num[i + 1]) {
                count = 0;
            }
        }
        return max;
    }
    public int longestConsecutive2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        int longest = 1;
        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int curStack = 1;
                while (set.contains(curNum + 1)) {
                    curNum++;
                    curStack++;
                }
                longest = Math.max(longest, curStack);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,4,5,6,7,8,9};
        System.out.println(longestConsecutive(nums));
    }
}
