package sort;

public class FindKthLargest {
    static int index = 0;
    public static int findKthLargest(int[] nums, int k) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            adjustHeap(nums, i, nums.length);
        }
        for (int j = nums.length - 1; j >= nums.length - k; j--) {
            int temp = nums[j];
            nums[j] = nums[0];
            nums[0] = temp;
            adjustHeap(nums, 0, j);
        }
        return nums[nums.length - k];
    }
    public static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        for (int k = i*2 + 1; k < length; k = k*2 + 1) {
            if(k + 1 < length && arr[k] < arr[k+1]){
                k = k + 1;
            }
            if(arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            }else {
                break;
            }
        }
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findKthLargest(nums, 1));
    }
}
