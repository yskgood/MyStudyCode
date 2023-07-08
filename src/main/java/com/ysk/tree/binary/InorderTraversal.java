package com.ysk.tree.binary;

import com.ysk.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * 思路：按左中右顺序递归遍历
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        inorder(root, ans);
        return ans;
    }

    private void inorder(TreeNode cur, List<Integer> ans) {
        if (cur == null) {
            return;
        }
        inorder(cur.left, ans);
        ans.add(cur.val);
        inorder(cur.right, ans);
    }
}
