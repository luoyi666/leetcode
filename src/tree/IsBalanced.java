package tree;

public class IsBalanced {
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        maxPath(root);
        return result;
    }
    public int maxPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxPath(root.left);
        int right = maxPath(root.right);
        if (Math.abs(right - left) > 1) {
            result = false;
        }
        return Math.max(left, right) + 1;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}