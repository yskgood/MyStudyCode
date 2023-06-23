package com.ysk.util;

import com.alibaba.fastjson2.JSON;
import org.junit.Test;

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
}
