package com.ysk.leetcode.tree.binary;

import com.ysk.leetcode.tree.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 107. 二叉树的层序遍历 II
 * 返回其节点值 自底向上的层序遍历
 * <p>
 * 思路：正常遍历，在将结果反转
 *
 * @see LevelOrder
 */
public class LevelOrderBottom {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> ls = new LinkedList<>();
            //当前行的节点数量
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                ls.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ans.add(ls);
        }

        //反转
        Collections.reverse(ans);

        return ans;
    }
}
