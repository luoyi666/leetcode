package tree;

import java.util.ArrayList;

public class FindSecondMinimumValue {
    ArrayList<Integer> nodeList = new ArrayList<Integer>();
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        if (root.left == null && root.right == null) return -1;
        int leftValue = root.left.val;
        int rightValue  = root.right.val;
        if (leftValue == root.val) leftValue = findSecondMinimumValue(root.left);
        if (rightValue == root.val) rightValue = findSecondMinimumValue(root.right);
        if (leftValue != -1 && rightValue != -1) return Math.min(leftValue, rightValue);
        if (leftValue != -1) return leftValue;
        return rightValue;
    }

}
