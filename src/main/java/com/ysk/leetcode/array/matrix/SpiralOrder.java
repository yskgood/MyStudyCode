package com.ysk.leetcode.array.matrix;

import java.util.LinkedList;
import java.util.List;

public class SpiralOrder {

    /**
     * 54. 螺旋矩阵
     *
     * @param matrix
     * @return
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<>();
        //边界判断
        int maxRow = matrix.length;
        if (maxRow == 0) {
            return result;
        }

        int maxCol = matrix[0].length;
        if (maxCol == 0) {
            return result;
        }

        //按螺旋的方式去读取
        int loop = 0;
        int start = 0;
        int row = 0;
        int col = 0;
        int maxLoop = Math.max(maxCol, maxRow);
        while (loop++ < maxLoop / 2) {
            //第一条边:[row,col)
            for (col = start; col < maxCol - loop; col++) {
                result.add(matrix[start][col]);
            }
            //第二条表：(row,col]
            for (row = start; row < maxRow - loop; row++) {
                result.add(matrix[row][col]);
            }
            //第三边：[row,col)
            for (; col >= loop; col--) {
                result.add(matrix[row][col]);
            }
            //第四边：(row,col]
            for (; row >= loop; row--) {
                result.add(matrix[row][col]);
            }
            //下一个循环
            start++;
        }

        //剩余的一个
        if (maxLoop % 2 == 1) {
            result.add(matrix[start][start]);
        }

        return result;
    }


}
