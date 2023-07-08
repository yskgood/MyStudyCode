package com.ysk.tree.binary;

import com.alibaba.fastjson2.JSON;
import com.ysk.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class PostorderTraversalTest {

    @Test
    public void test() {
        TreeNode treeNode = TreeNode.createTree("1,null,2,3");
        PostorderTraversal postorderTraversal = new PostorderTraversal();
        System.out.println(JSON.toJSONString(postorderTraversal.postorderTraversal(treeNode)));
    }
}