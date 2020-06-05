package tree;

import java.util.ArrayList;

public class GetMinimumDifference {
    int minValue = Integer.MAX_VALUE;
    TreeNode preNode = null;
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        inOrder(root, nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size() - 1; i++) {
            int dist = Math.abs(nums.get(i) - nums.get(i + 1));
            if (dist < min)
                min = dist;
        }
        return min;
    }
    public void inOrder(TreeNode root, ArrayList<Integer> nums) {
        if (root == null) return;
        inOrder(root.left, nums);
        nums.add(root.val);
        inOrder(root.right, nums);
    }
    public void inOrder2(TreeNode root) {
        if (root == null) return;
        inOrder2(root.left);
        if (preNode != null) minValue = Math.min(minValue, root.val - preNode.val);
        preNode = root;
        inOrder2(root.right);
    }
}
