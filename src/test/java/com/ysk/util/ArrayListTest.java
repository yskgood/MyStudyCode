package com.ysk.util;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author ysk
 * @date 2023/6/21 5:24 PM
 */
public class ArrayListTest {

    @Test
    public void test() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(1);
        }

        arrayList.add(1);
    }
}
