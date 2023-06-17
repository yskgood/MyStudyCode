package com.ysk.leetcode.array.search;

/**
 * 69:x 的平方根
 * 思路：
 * k*k<=x
 *
 * @author ysk
 * @date 2023/6/12 5:22 PM
 */
public class MySqrt {
    public static int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }


}
