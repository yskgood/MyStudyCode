package com.ysk.tree.binary;

import com.ysk.tree.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 637. 二叉树的层平均值
 */
public class AverageOfLevels {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new LinkedList<>();
        if (root == null) {
            return Arrays.asList(0d);
        }
        LinkedList<TreeNode> lelNodes = new LinkedList<>();
        lelNodes.add(root);

        while (!lelNodes.isEmpty()) {
            int size = lelNodes.size();
            double sum = 0d;
            for (int i = 0; i < size; i++) {
                //取出第一个
                TreeNode node = lelNodes.removeFirst();
                sum += node.val;
                //加入下一层
                if (node.left != null) {
                    lelNodes.addLast(node.left);
                }
                if (node.right != null) {
                    lelNodes.addLast(node.right);
                }
            }

            double avg = sum / size;
            ans.add(avg);
        }

        return ans;
    }
}
