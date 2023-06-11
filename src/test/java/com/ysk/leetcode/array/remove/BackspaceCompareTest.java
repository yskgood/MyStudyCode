package com.ysk.leetcode.array.remove;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackspaceCompareTest {

    @Test
    public void test() {
        Assert.assertTrue(BackspaceCompare.backspaceCompare("y#fo##f", "y#f#o##f"));
        Assert.assertTrue(BackspaceCompare.backspaceCompare("ab##", "c#d#"));
        Assert.assertFalse(BackspaceCompare.backspaceCompare("a#c", "ac"));

    }

}