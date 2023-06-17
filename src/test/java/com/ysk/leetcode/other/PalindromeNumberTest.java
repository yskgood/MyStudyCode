package com.ysk.leetcode.other;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ysk
 * @date 2023/6/15 11:29 AM
 */
public class PalindromeNumberTest {

    @Test
    public void test() {
        Assert.assertFalse(PalindromeNumber.isPalindrome(2147483647));
        Assert.assertTrue(PalindromeNumber.isPalindrome(1001));
        Assert.assertFalse(PalindromeNumber.isPalindrome(-121));
        Assert.assertTrue(PalindromeNumber.isPalindrome(121));
        Assert.assertTrue(PalindromeNumber.isPalindrome(5));
        Assert.assertFalse(PalindromeNumber.isPalindrome(-5));
        Assert.assertFalse(PalindromeNumber.isPalindrome(20));
        Assert.assertFalse(PalindromeNumber.isPalindrome(200));
    }

    @Test
    public void test2() {
        Assert.assertFalse(PalindromeNumber.isPalindrome2(2147483647));
        Assert.assertTrue(PalindromeNumber.isPalindrome2(1001));
        Assert.assertFalse(PalindromeNumber.isPalindrome2(-121));
        Assert.assertTrue(PalindromeNumber.isPalindrome2(121));
        Assert.assertTrue(PalindromeNumber.isPalindrome2(5));
        Assert.assertFalse(PalindromeNumber.isPalindrome2(-5));
        Assert.assertFalse(PalindromeNumber.isPalindrome2(20));
        Assert.assertFalse(PalindromeNumber.isPalindrome2(200));
    }

}