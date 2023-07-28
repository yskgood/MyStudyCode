package com.ysk.leetcode.tree.binary;

import com.ysk.leetcode.tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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


    /**
     * 栈遍历方式实现
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        //使用一个指针标识处理到那个了
        TreeNode cur = root;
        //使用栈存储需要处理的节点
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.isEmpty()) {
            //找到左叶子节点
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                //找到左了，取出来
                TreeNode topNode = stack.pop();
                ans.add(topNode.val);
                //处理右节点
                cur = topNode.right;
            }
        }
        return ans;
    }

    public List<Integer> inorderTraversal3(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (!st.empty()) {
            TreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                if (node.right != null) st.push(node.right);  // 添加右节点（空节点不入栈）
                st.push(node);                          // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。

                if (node.left != null) st.push(node.left);    // 添加左节点（空节点不入栈）
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
