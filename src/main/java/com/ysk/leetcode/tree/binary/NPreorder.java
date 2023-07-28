package com.ysk.leetcode.tree.binary;

import java.util.LinkedList;
import java.util.List;

/**
 * 589. N 叉树的前序遍历
 * 前序：中左右
 */
public class NPreorder {

    public List<Integer> preorder(Node root) {
        List<Integer> ans = new LinkedList<>();
        doPreorder(root,ans);
        return ans;
    }

    private void doPreorder(Node cur, List<Integer> ans) {
        if (cur == null) {
            return;
        }

        ans.add(cur.val);
        if (cur.children != null) {
            for (Node node : cur.children) {
                doPreorder(node, ans);
            }
        }
    }
}
