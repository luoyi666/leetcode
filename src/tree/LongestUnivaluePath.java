package tree;

public class LongestUnivaluePath {
    int maxValue = 0;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;
        return longest(root);
    }
    public int longest(TreeNode root) {
        if (root == null) return 0;
        int left = 0;
        int right = 0;
        if (root.val == root.left.val) {
            left = longest(root.left);
        }
        if (root.val == root.right.val) {
            right = longest(root.right);
        }
        if (left + right > maxValue) {
            maxValue = left +right;
        }
        return longest(root.left) + longest(root.right);
    }
}
