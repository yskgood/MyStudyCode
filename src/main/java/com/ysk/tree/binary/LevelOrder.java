package com.ysk.tree.binary;

import com.ysk.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. 二叉树的层序遍历
 * 思路：利用队列的先进先出特性
 */
public class LevelOrder {

    /**
     * 利用队列实现
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            //当前层内容
            List<Integer> levelValList = new LinkedList<>();
            //取出当前层的数量
            int size = queue.size();
            //处理当前层所有元素,并放入下层节点
            for (int i = 0; i < size; i++) {
                //取出节点
                TreeNode node = queue.poll();
                //放入内容
                levelValList.add(node.val);
                //放入节点的两个节点
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ans.add(levelValList);
        }

        return ans;
    }

    /**
     * 利用递归实现
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        recursion(root, ans, 1);
        return ans;
    }

    private void recursion(TreeNode cur, List<List<Integer>> ans, int depth) {
        if (cur == null) {
            return;
        }
        if (ans.size() < depth) {
            ans.add(new LinkedList<>());
        }
        //在对应层中加入（注意索引从0开始）
        ans.get(depth - 1).add(cur.val);
        //先处理左边
        recursion(cur.left, ans, depth + 1);
        //再处理右边
        recursion(cur.right, ans, depth + 1);
    }
}
