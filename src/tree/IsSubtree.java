package tree;

public class IsSubtree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        boolean result = isSubTreeWithSub(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
        return result;
    }
    public boolean isSubTreeWithSub(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        return isSubTreeWithSub(s.left, t.left) && isSubTreeWithSub(s.right, t.right);
    }
}
