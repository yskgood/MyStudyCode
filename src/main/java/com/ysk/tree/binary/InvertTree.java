package com.ysk.tree.binary;

import com.ysk.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 226. 翻转二叉树
 * 思路：一层一层左右互换
 */
public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                //先添加到队列
                TreeNode leftNode = cur.left;
                if (leftNode != null) {
                    queue.offer(leftNode);
                }
                TreeNode rightNode = cur.right;
                if (rightNode != null) {
                    queue.offer(rightNode);
                }
                //再反转
                cur.left = rightNode;
                cur.right = leftNode;

            }
        }
        return root;
    }


    /**
     * 使用递归
     *
     * @param root
     * @return
     */
    public TreeNode invertTree2(TreeNode root) {
        doInvertTree2(root);
        return root;
    }

    public void doInvertTree2(TreeNode cur) {
        if (cur == null) {
            return;
        }
        TreeNode temp = cur.left;
        cur.left = cur.right;
        cur.right = temp;

        doInvertTree2(cur.left);
        doInvertTree2(cur.right);
    }
}
