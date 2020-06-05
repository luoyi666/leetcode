package stackandqueue;

import java.util.Stack;

public class NextGreaterElements {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = -1;
        }
        Stack<Integer> indexs = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            while (!indexs.isEmpty() && nums[i] > nums[indexs.peek()]) {
                int preIndex = indexs.pop();
                dist[preIndex] = nums[i];
            }
            indexs.add(i);
        }
        if (!indexs.isEmpty()) {
            for (int i = 0; i < n; i++) {
                while (!indexs.isEmpty() && nums[i] > nums[indexs.peek()]) {
                    int preIndex = indexs.pop();
                    dist[preIndex] = nums[i];
                }
            }
        }
        return dist;
    }
}
