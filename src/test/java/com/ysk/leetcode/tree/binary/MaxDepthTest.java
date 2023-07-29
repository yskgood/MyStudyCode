package com.ysk.leetcode.tree.binary;

import com.ysk.leetcode.tree.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class MaxDepthTest {
    @Test
    public void test() {
        TreeNode treeNode = TreeNode.createCompleteTree("1,2,3,4,5,6,7");
        MaxDepth depth = new MaxDepth();
        Assert.assertEquals(depth.maxDepth(treeNode), 3);
        Assert.assertEquals(depth.maxDepth2(treeNode), 3);
    }
}