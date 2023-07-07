package com.ysk.util;

import org.junit.Test;

public class BinaryString {

    @Test
    public void test() {
        /**
         * 原码（Sign Magnitude）：最高位表示符号位，0表示正数，1表示负数，其余各位表示数值大小
         * 补码的表示方法是：
         * 1、对于一个有符号整数，如果它是正数，则它的补码与原码相同；
         * 2、如果它是负数，则它的补码是将其对应的正数的所有位取反（即0变为1，1变为0），然后再将结果加1得到的数
         * 二进制补码表示法中，一个n位二进制数的取值范围是从-2^(n-1)到2^(n-1)-1
         *
         * 知道补码计算原码
         * 1、先减1
         * 2、再取反
         */
        toBinaryString(0);
        toBinaryString(-0);
        toBinaryString(-1);
        toBinaryString(-2);
        toBinaryString(4);
        toBinaryString(-4);
        toBinaryString(5);
        toBinaryString(-5);
        toBinaryString(Integer.MAX_VALUE);
        toBinaryString(Integer.MIN_VALUE);
        //
        toBinaryString(Integer.MAX_VALUE << 1);
        toBinaryString(Integer.MAX_VALUE << 2);
        toBinaryString(Integer.MAX_VALUE << 3);
        toBinaryString(Integer.MAX_VALUE << 31);
    }

    @Test
    public void testOpt() {
        int a = 0b1010;  // 10的二进制表示
        int b = 0b1100;  // 12的二进制表示
        toBinaryString(a);
        toBinaryString(b);
        //按位与(&)：对两个操作数进行二进制按位与运算，只有当两个对应位都为1时结果为1，否则为0
        //00000000 00000000 00000000 00001010
        //00000000 00000000 00000000 00001100
        //00000000 00000000 00000000 00001000
        System.out.println("按位与");
        toBinaryString(a & b);  // 二进制按位与
        //按位或(|)：对两个操作数进行二进制按位或运算，有一个为1时结果为1，否则为0。
        //00000000 00000000 00000000 00001010
        //00000000 00000000 00000000 00001100
        //00000000 00000000 00000000 00001110
        System.out.println("按位或");
        toBinaryString(a | b);
        //按位异或(^)：对两个操作数进行二进制按位异或运算，相同为0，不同是为1。
        //00000000 00000000 00000000 00001010
        //00000000 00000000 00000000 00001100
        //00000000 00000000 00000000 00000110
        System.out.println("按位异或");
        toBinaryString(a ^ b);
        //按位取反(~)：对操作数进行二进制按位取反运算，将每一位0变成1，1变成0。
        //00000000 00000000 00000000 00001010
        //11111111 11111111 11111111 11110101
        System.out.println("按位取反");
        toBinaryString(~a);
        //左移(<<)：将操作数的二进制表示向左移动指定的位数，左侧空出的位用0填充。
        //00000000 00000000 00000000 00001010
        //00000000 00000000 00000000 00101000
        System.out.println("左移");
        int c = 0b01110000000000000000000000111010;
        toBinaryString(c);
        toBinaryString(c << 2);
        //每移动一位相当于乘以2^n
        toBinaryString(a);
        toBinaryString(a << 1);
        toBinaryString(a << 2);
        toBinaryString(a << 3);
        toBinaryString(a << 4);
        //将操作数的二进制表示向右移动指定的位数，右侧空出的位用符号位填充（即对于正数用0填充，对于负数用1填充）。
        System.out.println("有符号右移");
        int d = 0b11111111111111111000000000000010;
        toBinaryString(d);
        toBinaryString(d >> 1);
        //无符号右移(>>>)：将操作数的二进制表示向右移动指定的位数，右侧空出的位用0填充。
        toBinaryString(d >>> 1);
        //每移动一位相当于除2^n
        int e = 160;
        toBinaryString(e);
        toBinaryString(e >> 1);
        toBinaryString(e >> 2);
        toBinaryString(e >> 3);
    }

    private void toBinaryString(int num) {
        String binaryStr = String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0'); // 得到32位的二进制字符串，并将其中的空格替换为0
        String formattedBinaryStr = binaryStr.replaceAll("(\\d{8})(?!$)", "$1 ");
        System.out.println(String.format("%5s 二进制是 %s", num, formattedBinaryStr)); // 输出格式化后的二进制字符串
    }
}
