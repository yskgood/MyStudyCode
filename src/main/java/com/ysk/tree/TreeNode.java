package com.ysk.tree;

import java.util.Arrays;
import java.util.List;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    /**
     *
     * @param data
     * @return
     */
    public static TreeNode createCompleteTree(String data){
        String[] values = data.split(",");
        return buildTree(values, 0);
    }

    private static TreeNode buildTree(String[] values, int index) {
        if (index >= values.length || values[index].equals("null")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(values[index]));
        node.left = buildTree(values, index * 2 + 1);
        node.right = buildTree(values, index * 2 + 2);
        return node;
    }


    /**
     * 构建树
     * 数据格式：[5, 4, 7, 3, null, 2, null, -1, null, 9]
     * 串行化格式，表达了一个水平顺序遍历的二叉树。其中，你可以使用 null 来表达某一分支上没有子节点
     *
     * @param str
     * @return
     */
    public static TreeNode createTree(String str) {
        String[] nodes = str.split(",");
        TreeNode[] treeNodes = new TreeNode[nodes.length];
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i].equals("null")) {
                treeNodes[i] = null;
            } else {
                treeNodes[i] = new TreeNode(Integer.valueOf(nodes[i]));
            }
        }
        //连接
        int j = 0;
        for (int i = 0; i < treeNodes.length; i++) {
            TreeNode parent = treeNodes[i];
            if (parent != null) {
                if (2 * j + 1 < treeNodes.length) {
                    parent.left = treeNodes[2 * j + 1];
                }
                if (2 * j + 2 < treeNodes.length) {
                    parent.right = treeNodes[2 * j + 2];
                }
                j++;
            }
        }
        return treeNodes[0];
    }

    public static void printTree(TreeNode root) {
        int height = getHeight(root);
        int width = (1 << height) - 1;
        String[][] res = new String[height][width];
        for (String[] row : res) {
            Arrays.fill(row, " ");
        }
        fill(res, root, 0, 0, width - 1);
        for (String[] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }

    private static void fill(String[][] res, TreeNode root, int row, int left, int right) {
        if (root == null) {
            return;
        }
        int mid = (left + right) / 2;
        res[row][mid] = Integer.toString(root.val);
        fill(res, root.left, row + 1, left, mid - 1);
        fill(res, root.right, row + 1, mid + 1, right);
    }

    private static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }


}
