package com.ysk.leetcode.hash;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ysk
 * @date 2023/6/14 7:09 PM
 */
class HappyNumberTest {

    @Test
    void isHappy() {
        Assert.assertTrue(HappyNumber.isHappy(19));
        Assert.assertFalse(HappyNumber.isHappy(2));
    }
}