package com.ysk.leetcode.tree.binary;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429. N 叉树的层序遍历
 */
public class NLevelOrder {

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> ls = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                ls.add(node.val);
                //添加所有子节点
                for (Node child : node.children) {
                    queue.offer(child);
                }
            }
            ans.add(ls);
        }

        return ans;
    }
}
