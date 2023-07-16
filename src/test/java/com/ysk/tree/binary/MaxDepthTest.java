package com.ysk.tree.binary;

import com.ysk.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDepthTest {
    @Test
    public void test() {
        TreeNode treeNode = TreeNode.createCompleteTree("1,2,3,4,5,6,7");
        MaxDepth depth = new MaxDepth();
        Assert.assertEquals(depth.maxDepth(treeNode), 3);
    }
}