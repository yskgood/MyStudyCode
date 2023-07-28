package com.ysk.leetcode.tree.binary;

import com.ysk.leetcode.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 199. 二叉树的右视图
 * 没层中最靠右边的节点
 */
public class RightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            //取出本层所有节点，并放入下层到队列中
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                //最后一个节点放入结果
                if (i == (size - 1)) {
                    ans.add(node.val);
                }
                //放入下层节点
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

        }

        return ans;
    }
}
