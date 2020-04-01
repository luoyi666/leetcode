package doublepointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> arrayList = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if(nums1[i] < nums2[j]){
                arrayList.add(nums1[i]);
                i++;
            }else if (nums1[i] > nums2[j]){
                arrayList.add(nums2[j]);
                j++;
            }else {
                arrayList.add(nums1[i]);
                arrayList.add(nums2[j]);
                i++;
                j++;
            }
        }
        while(i < m){
            arrayList.add(nums1[i]);
            i++;
        }
        while(j < n){
            arrayList.add(nums2[j]);
            j++;
        }
        for (int k = 0; k < m+n; k++) {
            nums1[k] = arrayList.get(k);
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;
        int indexMerge = m + n - 1;
        while(i >=0 || j >= 0){
            if(i < 0){
                nums1[indexMerge--] = nums2[j--];
            }else if(j< 0) {
                nums1[indexMerge--] = nums1[i--];
            }else if (nums1[i] > nums2[j]){
                nums1[indexMerge--] = nums1[i--];
            }else {
                nums1[indexMerge--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        merge2(num1,3, num2, 3);
    }
}
