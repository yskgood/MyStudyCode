package com.ysk.tree.binary;

import com.alibaba.fastjson2.JSON;
import com.ysk.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class PreorderTraversalTest {

    @Test
    public void preorderTraversal() {
        TreeNode treeNode = TreeNode.createTree("1,null,2,3");
        PreorderTraversal preorderTraversal = new PreorderTraversal();
        System.out.println(JSON.toJSONString(preorderTraversal.preorderTraversal(treeNode)));
    }
}