package com.ysk.leetcode.tree.binary;

import com.ysk.leetcode.tree.TreeNode;

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
        if (root == null) {
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

    /**
     * 统一迭代风格：
     * 要处理的节点放入栈之后，紧接着放入一个空指针作为标记
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal3(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (!st.empty()) {
            TreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                if (node.right != null) st.push(node.right);  // 添加右节点（空节点不入栈）
                if (node.left != null) st.push(node.left);    // 添加左节点（空节点不入栈）
                st.push(node);                          // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。

            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                st.pop();           // 将空节点弹出
                node = st.peek();    // 重新取出栈中元素
                st.pop();
                result.add(node.val); // 加入到结果集
            }
        }
        return result;
    }
}
