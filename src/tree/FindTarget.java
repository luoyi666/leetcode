package tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class FindTarget {

    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> valueList = new ArrayList<Integer>();
        inorder(root, valueList);
        int i = 0;
        int j = valueList.size() - 1;
        while (i < j) {
            int sum = valueList.get(i) + valueList.get(j);
            if (sum > k) {
                i++;
            }else if (sum < k) {
                j--;
            }else {
                return true;
            }
        }
        return false;
    }
    public void inorder(TreeNode root, ArrayList<Integer> value) {
        if (root == null) return;
        inorder(root.left, value);
        value.add(root.val);
        inorder(root.right, value);
    }
}
