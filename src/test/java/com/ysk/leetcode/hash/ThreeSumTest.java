package com.ysk.leetcode.hash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ysk
 * @date 2023/6/13 2:11 PM
 */
class ThreeSumTest {

    @Test
    void threeSum() {
        System.out.println(ThreeSum.threeSum(new int[]{-4, -1, -1, 0, 1, 2}, 0));
        System.out.println(ThreeSum.threeSum(new int[]{-4, -1, -1, -1, 0, 1, 2}, 0));
        System.out.println(ThreeSum.threeSum(new int[]{-4, -1, -1, -1, -1, 0, 1, 2, 2, 2}, 0));

        System.out.println(ThreeSum.threeSum(new int[]{-4, -1, -1, -1, -1, 0, 1, 2, 2, 2}, 3));


    }
}