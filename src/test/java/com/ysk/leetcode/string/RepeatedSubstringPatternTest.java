package com.ysk.leetcode.string;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ysk
 * @date 2023/6/20 5:53 PM
 */
public class RepeatedSubstringPatternTest {

    @Test
    void repeatedSubstringPattern() {
        Assert.assertFalse(RepeatedSubstringPattern.repeatedSubstringPattern("aba"));
        Assert.assertTrue(RepeatedSubstringPattern.repeatedSubstringPattern("abab"));
        Assert.assertTrue(RepeatedSubstringPattern.repeatedSubstringPattern("abcabcabcabc"));

    }
}