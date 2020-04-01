package test;

public class LengthOfLIS {
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int maxLen = 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] < nums[j]){
                    count++;
                }
            }
            if(maxLen < count){
                maxLen = count;
            }
            count = 0;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums ={10,9,2,5,3,7,101,18};
        int maxLen = lengthOfLIS(nums);
        System.out.println(maxLen);
    }
}
