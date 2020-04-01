package sort;

public class FindKthLargest {
    static int index = 0;
    public static int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        quickSort(nums, left, right, k);
        return nums[index];
    }
    public static void quickSort(int[] nums, int left, int right, int k) {
        if(left < right) {
            int i = left;
            int j = right;
            int temp = nums[i];
            while(i < j) {
                while(i < j && nums[j] > temp){
                    j--;
                }
                if(i < j){
                    nums[i] = nums[j];
                    i++;
                }
                while(i < j && nums[i] < temp) {
                    i++;
                }
                if(i < j){
                    nums[j] = nums[i];
                    j--;
                }
                nums[i] = temp;
                if(nums.length - i == k) {
                    index = i;
                    return;
                }
                quickSort(nums, left, i - 1, k);
                quickSort(nums, i + 1, right, k);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findKthLargest(nums, 1));
    }
}
