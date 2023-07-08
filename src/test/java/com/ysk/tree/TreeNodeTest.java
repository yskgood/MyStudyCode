package com.ysk.tree;

import com.alibaba.fastjson2.JSON;
import com.ysk.tree.binary.PreorderTraversal;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TreeNodeTest {

    @Test
    public void test() {
        TreeNode treeNode = TreeNode.createTree("1,2,3");
        TreeNode.printTree(treeNode);

    }
}