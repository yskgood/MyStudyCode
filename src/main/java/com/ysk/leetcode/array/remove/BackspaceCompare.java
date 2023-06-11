package com.ysk.leetcode.array.remove;

/**
 * 844. 比较含退格的字符串
 */
public class BackspaceCompare {

    public static boolean backspaceCompare(String s, String t) {
        String s1 = backspace(s);
        String t1 = backspace(t);
        return s1.equals(t1);
    }

    /**
     * # 代表退格字符，遇到一个删除前面的字符
     * 入：a#c 出：c
     *
     * @param source
     * @return
     */
    private static String backspace(String source) {
        if (source.isEmpty() || source == "#") {
            return "";
        }
        char[] sourceCharArray = source.toCharArray();
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < sourceCharArray.length; fastIndex++) {
            if (sourceCharArray[fastIndex] == '#') {
                if (slowIndex > 0) {
                    slowIndex--;
                }

            } else {
                sourceCharArray[slowIndex] = sourceCharArray[fastIndex];
                slowIndex++;
            }
        }

        return String.valueOf(sourceCharArray, 0, slowIndex);
    }


}
