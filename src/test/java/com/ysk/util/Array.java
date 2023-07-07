package com.ysk.util;

import com.alibaba.fastjson2.JSON;
import org.junit.Test;

import java.util.Arrays;

/**
 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * 该方法的参数包括：
 * <p>
 * src：源数组；
 * srcPos：源数组中的起始位置；
 * dest：目标数组；
 * destPos：目标数组中的起始位置；
 * length：要复制的数组元素数量。
 */
public class Array {

    @Test
    public void testSystemArraycopy() {
        int[] array = new int[]{0, 1, 2, 3, 4};
        //模拟删除index=2的元素
        int index = 2;
        //计算需要移动的数量
        int j = array.length - index - 1;
        //利用System.arraycopy 拷贝,srcPos排查删除的元素位置，所以从index+1开始复制，放入目标数组后从index开始覆盖
        System.arraycopy(array, index + 1, array, index, j);
        System.out.println(JSON.toJSONString(array));

        //删除最后一个元素
        array[array.length - 1] = -1;

        System.out.println(JSON.toJSONString(array));
    }

    @Test
    public void testAdd() {
        int len = 5;
        int insertIndex = 2;
        //模拟在数组中插入一个元素
        int[] array = new int[]{0, 1, 2, 3, 4, -1, -1, -1};
        System.out.println(JSON.toJSONString(array));
        //假设在index为2的地方插入5
        //需要将2以后的位置全部右移
        //需要移动的数量
        int moveSize = len - insertIndex;

        System.arraycopy(array, insertIndex, array, insertIndex + 1, moveSize);
        System.out.println(JSON.toJSONString(array));

        array[insertIndex] = 5;
        System.out.println(JSON.toJSONString(array));


    }

    @Test
    public void testGrow() {
        //模拟数组的扩容
        int[] array = new int[]{0, 1, 2, 3, 4};
        //长度增加到10
        array = Arrays.copyOf(array, 10);
        System.out.println(JSON.toJSONString(array));
    }
}
