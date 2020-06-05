package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class KthSmallest {
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> linkedList = new LinkedList<TreeNode>();
        while (true) {
            while (root != null) {
                linkedList.add(root);
                root = root.left;
            }
            root = linkedList.pollLast();
            k--;
            if (k == 0) return root.val;
            root = root.right;
        }
    }

}
