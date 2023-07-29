package com.ysk.leetcode.tree.binary;

import com.ysk.leetcode.tree.TreeNode;

/**
 * 559. N 叉树的最大深度
 */
public class NMaxDepth {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        return maxDepth(root, 1);
    }

    /**
     * 使用深度的方式求解
     *
     * @param cur
     * @param depth
     * @return
     */
    private int maxDepth(Node cur, int depth) {
        if (cur == null) {
            return depth;
        }
        //记录每层的最大深度
        //注意：这里不能用Depth直接算，否则在当前层会累加
        int maxDepth = depth;
        for (Node node : cur.children) {
            maxDepth = Math.max(maxDepth, maxDepth(node, depth + 1));
        }
        return maxDepth;
    }

    /**
     * 递归求最大高度
     *
     * @param root
     * @return
     */
    public int maxDepth2(Node root) {
        if (root == null) {
            return 0;
        }
        int height = 0;
        for (Node node : root.children) {
            height = Math.max(height, maxDepth2(node));
        }

        return height + 1;
    }
}
