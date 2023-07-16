package com.ysk.tree.binary;

import com.ysk.tree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 101. 对称二叉树
 * 思路：
 * 1、左树：左右中
 * 2、右树：右左中
 */
public class IsSymmetric {

    /**
     * 基于递归的实现
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode leftNode, TreeNode rightNode) {
        //为空情况判断
        if (leftNode == null && rightNode != null) {
            return false;
        } else if (leftNode != null && rightNode == null) {
            return false;
        } else if (leftNode == null && rightNode == null) {
            return true;
        }
        //两个都不为空
        //如果两个值不同，返回
        if (leftNode.val != rightNode.val) {
            return false;
        }

        //相同的情况继续递归找
        boolean outside = compare(leftNode.left, rightNode.right);
        boolean inside = compare(leftNode.right, rightNode.left);
        return outside && inside;
    }

    /**
     * 基于列表的实现
     *
     * @param root
     * @return
     */
    public boolean isSymmetric2(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while ((!queue.isEmpty())) {
            //取出左右节点
            TreeNode leftNode = queue.poll();
            TreeNode rightNode = queue.poll();
            //判读是否相等
            if (leftNode == null && rightNode == null) {
                continue;
            }
            if (leftNode == null || rightNode == null || (leftNode.val != rightNode.val)) {
                return false;
            }
            //放入下层节点
            //外层
            queue.offer(leftNode.left);
            queue.offer(rightNode.right);
            //内层
            queue.offer(leftNode.right);
            queue.offer(rightNode.left);
        }

        return true;

    }

}
