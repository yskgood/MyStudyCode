package com.ysk.leetcode.tree.binary;

import java.util.LinkedList;
import java.util.List;

/**
 * 590. N 叉树的后序遍历
 * 后序：左右中 次序
 */
public class NPostorder {

    public List<Integer> postorder(Node root) {
        List<Integer> ans = new LinkedList<>();
        doPostorder(root, ans);
        return ans;
    }

    private void doPostorder(Node cur, List<Integer> ans) {
        if (cur == null) {
            return;
        }
        if (cur.children != null) {
            for (Node node : cur.children) {
                doPostorder(node, ans);
            }
        }
        ans.add(cur.val);
    }
}
