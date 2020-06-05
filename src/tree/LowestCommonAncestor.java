package tree;

public class LowestCommonAncestor {
    TreeNode ancestorNode = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        isCommonAncestor(root, p, q);
        return ancestorNode;
    }
    public void isCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return;
        if (isSonNode(root, p) && isSonNode(root, q)) ancestorNode = root;
        isCommonAncestor(root.left, p, q);
        isCommonAncestor(root.right, p, q);
    }
    public boolean isSonNode(TreeNode ancesNode, TreeNode sonNode) {
        if (ancesNode == null) return false;
        if (ancesNode == sonNode) return true;
        return isSonNode(ancesNode.left, sonNode) || isSonNode(ancesNode.right, sonNode);
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        int pvalue = p.val;
        int qvalue = q.val;
        if (pvalue > root.val && qvalue > root.val) return lowestCommonAncestor(root.right, p, q);
        else if (pvalue < root.val && qvalue < root.val) return lowestCommonAncestor(root.left, p, q);
        else return root;
    }
}
