package com.ysk.tree.binary;

import com.ysk.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历
 * 思路：按中左右方式递归遍历
 */
public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        preorder(root,ans);
        return ans;
    }

    private void preorder(TreeNode cur, List<Integer> ans) {
        //终止条件
        if (cur == null) {
            return;
        }
        //中
        ans.add(cur.val);
        //左
        preorder(cur.left, ans);
        //右
        preorder(cur.right, ans);
    }
}
