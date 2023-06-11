package com.ysk.leetcode.array.matrix;

/**
 * 59. 螺旋矩阵 II
 */
public class GenerateMatrix {

    public int[][] generateMatrix(int n) {
        int loop = 0;  // 控制循环次数
        int[][] res = new int[n][n];
        int start = 0;  // 每次循环的开始点(start, start)
        int count = 1;  // 定义填充数字
        int row, col;

        while (loop++ < n / 2) { // 判断边界后，loop从1开始
            // 第一条边： 模拟上侧从[左，右),预留一个位置给个边
            for (col = start; col < n - loop; col++) {
                res[start][col] = count++;
            }

            // 第二条边： 模拟右侧从[上，下)
            for (row = start; row < n - loop; row++) {
                res[row][col] = count++;
            }

            //第三条边： 模拟下侧从[右,左)
            for (; col >= loop; col--) {
                res[row][col] = count++;
            }

            //第四条边：模拟左侧[下,上)
            for (; row >= loop; row--) {
                res[row][col] = count++;
            }
            start++;

        }
        //剩余的一个
        if (n % 2 == 1) {
            res[start][start] = count;
        }

        return res;
    }

}
