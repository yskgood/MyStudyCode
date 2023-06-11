package com.ysk.leetcode.list;

import org.junit.Test;

public class RemoveListElementsTest {

    @Test
    public void removeElements() {
        ListNode test = ListNode.build(new int[]{1, 2, 6, 3, 4, 5, 6, 6});
        ListNode resultNode = RemoveListElements.removeElements(test, 6);
        ListNode.print(resultNode);
    }
}