package com.ysk.leetcode.tree.binary;

import com.ysk.leetcode.tree.TreeNode;
import org.junit.Test;

public class InvertTreeTest {

    @Test
    public void test() {
        InvertTree invertTree = new InvertTree();
        TreeNode treeNode = TreeNode.createCompleteTree("4,2,7,1,3,6,9");
        treeNode = invertTree.invertTree2(treeNode);
        TreeNode.printTree(treeNode);
    }

}