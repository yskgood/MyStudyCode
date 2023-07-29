package com.ysk.leetcode.tree.binary;

import com.ysk.leetcode.tree.TreeNode;

/**
 * 104. 二叉树的最大深度
 * 二叉树节点的深度：指从根节点到该节点的最长简单路径边的条数或者节点数（取决于深度从0开始还是从1开始）--前序遍历
 * 二叉树节点的高度：指从该节点到叶子节点的最长简单路径边的条数或者节点数（取决于高度从0开始还是从1开始）--后续遍历
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        //递归找出左树的最大深度和右树的最大深度，取最大的
        return maxDepth(root, 0);
    }

    /**
     * 采用前序遍历（中左右）求树的深度
     *
     * @param cur
     * @param depth
     * @return
     */
    private int maxDepth(TreeNode cur, int depth) {
        if (cur == null) {
            return depth;
        }

        int maxLeft = maxDepth(cur.left, depth + 1);
        int maxRight = maxDepth(cur.right, depth + 1);
        return Math.max(maxLeft, maxRight);
    }

    public int maxDepth2(TreeNode root) {
        return getHeight(root);
    }

    /**
     * 采用后续遍历（左右中）求树的高度
     *
     * @param node
     * @return
     */
    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = getHeight(node.left);
        int right = getHeight(node.right);
        int depth = 1 + Math.max(left, right);
        return depth;
    }

}
