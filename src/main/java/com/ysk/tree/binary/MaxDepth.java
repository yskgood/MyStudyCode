package com.ysk.tree.binary;

import com.ysk.tree.TreeNode;

/**
 * 104. 二叉树的最大深度
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        //递归找出左树的最大深度和右树的最大深度，取最大的
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode cur, int depth) {
        if (cur == null) {
            return depth;
        }

        int maxLeft = maxDepth(cur.left, depth + 1);
        int maxRight = maxDepth(cur.right, depth + 1);
        return Math.max(maxLeft, maxRight);
    }
}
