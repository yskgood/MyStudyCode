package com.ysk.tree.binary;

import com.ysk.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 144. 二叉树的前序遍历
 * 思路：按中左右方式递归遍历
 */
public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        preorder(root, ans);
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


    /**
     * 采用栈遍历的方式实现
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if(root==null){
            return ans;
        }
        Stack<TreeNode> treeNodeStack = new Stack<>();
        treeNodeStack.push(root);
        while (!treeNodeStack.isEmpty()) {
            TreeNode parent = treeNodeStack.pop();
            ans.add(parent.val);
            //先处理左树，所以要先让右边进去
            if (parent.right != null) {
                treeNodeStack.push(parent.right);
            }
            if (parent.left != null) {
                treeNodeStack.push(parent.left);
            }
        }
        return ans;
    }
}
