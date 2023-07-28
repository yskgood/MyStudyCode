package com.ysk.leetcode.tree;

import org.junit.Test;

public class TreeNodeTest {

    @Test
    public void test() {
        TreeNode treeNode = TreeNode.createTree("1,2,3");
        TreeNode.printTree(treeNode);

    }
}