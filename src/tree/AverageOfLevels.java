package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> levels = new ArrayList<Double>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        levels.add(root.val / 1.0);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pop();
                sum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            levels.add(sum / size);
        }
        return levels;
    }
}
