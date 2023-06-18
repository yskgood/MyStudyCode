package com.ysk.leetcode.string;

/**
 * 541. 反转字符串 II
 * 思路：
 * 1、根据2K将字符数组切分成N段（整除），和甚于的大小（取余）
 * 2、根据题目要求分别计算每个反转的位置
 * 3、坐标值的确认可以用个短数组实际看下，避免bug
 */
public class ReverseStr {

    public String reverseStr(String s, int k) {
        if (k <= 0) {
            return s;
        }

        char[] strArray = s.toCharArray();
        //看下可以切割成多个2K
        int stage = strArray.length / (2 * k);
        //处理这部分的反转
        int leftIndex = 0;
        int rightIndex = k - 1;
        for (int i = 0; i < stage; i++) {
            revert(strArray, leftIndex, rightIndex);
            //处理下个部分
            leftIndex += 2 * k;
            rightIndex += 2 * k;
        }
        //看下剩余
        int remain = strArray.length % (2 * k);
        if (remain < k) {
            //全部反转
            revert(strArray, strArray.length - remain, strArray.length - 1);
        } else if (remain >= k) {
            //k的部分反转
            //不用转化的长度
            int nr = remain - k;
            revert(strArray, strArray.length - nr - k, strArray.length - nr - 1);
        }
        return new String(strArray);
    }

    /**
     * 指定区间字符反转
     *
     * @param strArray
     * @param leftIndex
     * @param rightIndex
     */
    private void revert(char[] strArray, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            char leftVal = strArray[leftIndex];
            char rightVal = strArray[rightIndex];
            strArray[leftIndex] = rightVal;
            strArray[rightIndex] = leftVal;
            rightIndex--;
            leftIndex++;
        }
    }
}
