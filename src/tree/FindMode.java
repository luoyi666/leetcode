package tree;

import java.util.ArrayList;

public class FindMode {
    TreeNode preNode = null;
    int maxCount = Integer.MIN_VALUE;
    int count = 0;
    public int[] findMode(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        inOrder(root, list);
        int[] mode = new int[list.size()];
        for (int i = 0; i < mode.length - 1; i++) {
            mode[i] = list.get(i);
        }
        return mode;
    }
    public void inOrder(TreeNode node, ArrayList<Integer> list) {
        if (node == null) return;
        inOrder(node.left, list);
        if (preNode != null) {
            if (preNode.val != node.val) {
                count = 0;
            }else {
                count++;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            list.clear();
            list.add(node.val);
        }else if (count == maxCount) {
            list.add(node.val);
        }
        preNode = node;
        inOrder(node.right, list);
    }
}
