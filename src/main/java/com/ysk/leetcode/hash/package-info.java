/**
 * 哈希表相关
 * 哈希表是根据关键码的值而直接进行访问的数据结构
 * 哈希表中关键码就是数组的索引下标，然后通过下标直接访问数组中的元素
 * 那么哈希表能解决什么问题呢，一般哈希表都是用来快速判断一个元素是否出现集合里
 * <p>
 * 适用问题：
 * 1、按一定特征进行归类
 * <p>
 * 哈希函数:一般hashcode是通过特定编码方式，可以将其他数据格式转化为不同的数值
 * <p>
 * 哈希碰撞
 * 两个存储对象的Hash值一样，一般哈希碰撞有两种解决方法， 拉链法和线性探测法
 * <p>
 * 拉链法
 * 其实拉链法就是要选择适当的哈希表的大小，这样既不会因为数组空值而浪费大量内存，也不会因为链表太长而在查找上浪费太多时间。
 * <p>
 * 线性探测法
 * 使用线性探测法，一定要保证tableSize大于dataSize。 我们需要依靠哈希表中的空位来解决碰撞问题
 * <p>
 * Java中的实现
 * HashMap（数组+链表/红黑树）
 * HashSet-->TreeMap（红黑树）
 * <p>
 * 参考：
 * 1、Hashmap链表长度为8时转换成红黑树，你知道为什么是8吗（https://blog.csdn.net/H_Rhui/article/details/113601551）
 */
package com.ysk.leetcode.hash;