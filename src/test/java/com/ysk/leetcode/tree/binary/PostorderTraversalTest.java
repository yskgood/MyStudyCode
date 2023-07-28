package com.ysk.leetcode.tree.binary;

import com.alibaba.fastjson2.JSON;
import com.ysk.leetcode.tree.TreeNode;
import org.junit.Test;

public class PostorderTraversalTest {

    @Test
    public void test() {
        TreeNode treeNode = TreeNode.createTree("1,null,2,3");
        PostorderTraversal postorderTraversal = new PostorderTraversal();
        System.out.println(JSON.toJSONString(postorderTraversal.postorderTraversal(treeNode)));
    }
}