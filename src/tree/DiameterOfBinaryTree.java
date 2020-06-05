package tree;

public class DiameterOfBinaryTree {
    int maxValue = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxPath(root);
        return maxValue;
    }
    public int maxPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxPath(root.left);
        int right = maxPath(root.right);
        if (left + right > maxValue) {
            maxValue = left + right;
        }
        return Math.max(left, right) + 1;
    }
}
