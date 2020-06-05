package tree;

public class MergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode temp = new TreeNode(t1.val + t2.val);
        temp.left = mergeTrees(t1.left ,t2.left);
        temp.right = mergeTrees(t1.right, t2.right);
        return temp;
    }
}
