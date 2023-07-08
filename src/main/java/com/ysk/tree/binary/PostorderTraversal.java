package com.ysk.tree.binary;

import com.ysk.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 * 思路：按左右中的顺序递归树
 */
public class PostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        postorder(root, ans);
        return ans;
    }

    private void postorder(TreeNode cur, List<Integer> ans) {
        if (cur == null) {
            return;
        }
        postorder(cur.left, ans);
        postorder(cur.right, ans);
        ans.add(cur.val);
    }
}
