package sort;

public class SortColors {
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length - 1);
    }
    public void quickSort(int[] nums, int left, int right) {
        if(left < right) {
            int i = left;
            int j = right;
            int temp = nums[left];
            while(i < j) {
                while(i < j && nums[j] >= temp){
                    j--;
                }
                if(i < j) {
                    nums[i] = nums[j];
                    i++;
                }
                while(i < j && nums[i] < temp) {
                    i++;
                }
                if(i < j) {
                    nums[j] = nums[i];
                    j--;
                }
            }
            nums[i] = temp;
            quickSort(nums, left, i - 1);
            quickSort(nums, i + 1, right);
        }
    }
}
