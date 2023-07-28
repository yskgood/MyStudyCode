package com.ysk.tree.binary;

import com.ysk.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvertTreeTest {

    @Test
    public void test() {
        InvertTree invertTree = new InvertTree();
        TreeNode treeNode = TreeNode.createCompleteTree("4,2,7,1,3,6,9");
        treeNode = invertTree.invertTree2(treeNode);
        TreeNode.printTree(treeNode);
    }

}