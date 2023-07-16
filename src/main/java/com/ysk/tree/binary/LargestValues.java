package com.ysk.tree.binary;

import com.ysk.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 515. 在每个树行中找最大值
 */
public class LargestValues {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                max = Math.max(node.val, max);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ans.add(max);
        }
        return ans;
    }
}
