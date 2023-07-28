package com.ysk.leetcode.tree.binary;

import com.ysk.leetcode.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 572. 另一棵树的子树
 * 思路：依次看root的每个节点子树是否和subRoot一样，如果有一样的退出
 *
 * @see IsSameTree
 */
public class IsSubtree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null && subRoot != null) {
            return false;
        }
        if (root != null && subRoot == null) {
            return false;
        }
        //遍历root每个节点
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (isSameTree(currentNode, subRoot)) {
                return true;
            }
            //加入下一层
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }

        return false;
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        //为空情况判断
        if (p == null && q == null) {
            return true;
        } else if (p != null && q == null) {
            return false;
        } else if (p == null && q != null) {
            return false;
        }
        //有值情况判断
        if (p.val != q.val) {
            return false;
        }

        boolean isLeftSame = isSameTree(p.left, q.left);
        boolean isRightSame = isSameTree(p.right, q.right);
        return isLeftSame && isRightSame;
    }
}
