package com.ysk.leetcode.tree.binary;

import com.ysk.leetcode.tree.TreeNode;

/**
 * 100. 相同的树
 * 思路：用递归的方式，看每个树的相同节点是否一致
 *
 * @see IsSymmetric
 */
public class IsSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return sameTreeNode(p, q);
    }

    private boolean sameTreeNode(TreeNode p, TreeNode q) {
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

        boolean isLeftSame = sameTreeNode(p.left, q.left);
        boolean isRightSame = sameTreeNode(p.right, q.right);
        return isLeftSame && isRightSame;

    }
}
