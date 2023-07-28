package com.ysk.leetcode.tree.binary;

import com.ysk.leetcode.tree.TreeNode;

import java.util.*;

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

    /**
     * 遍历方式实现
     *
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Stack<TreeNode> treeNodeStack = new Stack<>();
        treeNodeStack.push(root);
        while (!treeNodeStack.isEmpty()) {
            TreeNode parent = treeNodeStack.pop();
            ans.add(parent.val);
            if (parent.left != null) {
                treeNodeStack.push(parent.left);
            }
            if (parent.right != null) {
                treeNodeStack.push(parent.right);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    public List<Integer> postorderTraversal3(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (!st.empty()) {
            TreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                st.push(node);                          // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。
                if (node.right != null) st.push(node.right);  // 添加右节点（空节点不入栈）
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
