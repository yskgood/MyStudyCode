package com.ysk.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author ysk
 * @date 2023/6/21 4:18 PM
 */
public class StrStrTest {

    @Test
    public void testStrStr() throws Exception {
        Assert.assertEquals(-1, StrStr.strStr("mississippi", "issipi"));
        Assert.assertEquals(-1, StrStr.strStr("aaa", "aaaa"));
        Assert.assertEquals(0, StrStr.strStr("sadbutsad", "sad"));
        Assert.assertEquals(-1, StrStr.strStr("leetcode", "leeto"));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme