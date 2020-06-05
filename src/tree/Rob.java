package tree;

public class Rob {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        int res = Math.max(rob(root), (rob(root.left)+rob(root.right)));
        return res;
    }
    public int robWithNode(TreeNode node) {
        int result = node.val;
        if (node == null) return 0;
        if (isLeaf(node)) return node.val;
        if (!isLeaf(node.left)) {
            result = result + robWithNode(node.left.left) + robWithNode(node.left.right);
        }
        if (!isLeaf(node.right)) {
            result = result + robWithNode(node.right.left) + robWithNode(node.right.right);
        }
        return result;
    }
    public boolean isLeaf(TreeNode node) {
        if (node == null) return false;
        return node.left == null && node.right == null;
    }
}
