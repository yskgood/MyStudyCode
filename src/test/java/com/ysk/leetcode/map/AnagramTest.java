package com.ysk.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void isAnagram() {

        Assert.assertTrue(Anagram.isAnagram("anagram","nagaram"));
        Assert.assertTrue(Anagram.isAnagram2("anagram","nagaram"));
        Assert.assertFalse(Anagram.isAnagram("rat","car"));
        Assert.assertFalse(Anagram.isAnagram2("rat","car"));
    }
}