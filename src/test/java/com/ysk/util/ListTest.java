package com.ysk.util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * List 是 Java 中一种有序的集合，它可以按照插入顺序存储元素，并且支持随机访问和修改。Java 中 List 的实现有以下几种：
 * <p>
 * ArrayList：基于数组实现的动态数组，支持快速随机访问，但插入和删除操作比较慢；
 * LinkedList：基于链表实现的双向链表，支持快速插入和删除操作，但随机访问比较慢；
 * CopyOnWriteArrayList：基于数组实现的动态数组，支持并发访问和修改，读操作不需要加锁，写操作需要复制一份数组并在副本上进行修改，修改完成后再将副本替换原数组；
 * Vector：与 ArrayList 类似，但是支持线程安全，即所有方法都是同步的，不需要额外的同步措施，但在高并发场景下性能较差。
 * 上述 List 的实现在不同的场景下有着各自的优缺点。在需要频繁随机访问和修改元素的场景下，使用 ArrayList 是比较合适的选择；在需要频繁插入和删除元素的场景下，使用 LinkedList 更为合适；在并发访问场景下，使用 CopyOnWriteArrayList 可以保证线程安全；在需要线程安全的同时性能要求不高的场景下，可以使用 Vector。
 *
 * @author ysk
 * @date 2023/6/21 5:24 PM
 */
public class ListTest {

    /**
     * ArrayList 是 Java 中一种基于数组实现的动态数组，它可以根据需要动态扩展容量，支持快速随机访问和修改。ArrayList 的实现原理如下：
     * <p>
     * 初始容量为 0：当创建一个新的 ArrayList 时，它的容量为 0，此时还没有分配底层数组，只有在第一次添加元素时才会进行分配；
     * 自动扩容机制：在添加元素时，ArrayList 会根据需要动态扩展容量。当元素数量超出当前容量时，ArrayList 会自动进行扩容，一般的实现方式是扩容为当前容量的 1.5 倍或 2 倍。扩容时，ArrayList 会分配一个更大的底层数组，并将原有元素拷贝到新的数组中；
     * 随机访问和修改：由于 ArrayList 的底层实现是数组，因此它支持随机访问和修改，即可以通过索引号快速访问和修改元素；
     * 元素的添加和删除：在数组末尾添加元素时，时间复杂度是 O(1)；在数组中间或头部添加元素时，需要将后面的元素往后移动，时间复杂度是 O(n)；在数组末尾删除元素时，时间复杂度是 O(1)；在数组中间或头部删除元素时，需要将后面的元素往前移动，时间复杂度是 O(n)。
     * 需要注意的是，由于数组在添加和删除元素时需要移动后面的元素，因此在频繁添加和删除元素的场景下，ArrayList 的性能会受到影响。此时建议使用 LinkedList 等其他的数据结构。
     */
    @Test
    public void testArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(1);
        }

        arrayList.add(1);
    }

    /**
     * LinkedList 是 Java 中一种基于链表实现的双向链表，它可以按照插入顺序存储元素，并且支持快速插入、删除和修改。LinkedList 的实现原理如下：
     * <p>
     * 双向链表：LinkedList 内部使用双向链表来存储元素，每个节点都包含一个前驱节点和一个后继节点，可以快速访问任意位置的元素，支持高效的插入和删除操作；
     * 头尾节点：LinkedList 维护了头节点和尾节点两个指针，分别指向链表的第一个节点和最后一个节点，可以快速访问头尾元素；
     * 内部类 Node：LinkedList 中每个节点都是一个内部类 Node 的实例，包含元素值、前驱节点和后继节点；
     * 元素的添加和删除：在链表头部添加或删除元素时，时间复杂度是 O(1)；在链表尾部添加或删除元素时，时间复杂度也是 O(1)；在链表中间添加或删除元素时，需要遍历链表找到对应位置，时间复杂度是 O(n)；
     * 迭代器：LinkedList 提供了 ListIterator 接口的实现类，可以支持双向迭代，快速访问任意位置的元素。
     * 需要注意的是，由于 LinkedList 的底层实现是链表，因此它不支持随机访问和修改。如果需要频繁访问和修改元素，建议使用 ArrayList 等其他的数据结构。而在需要频繁插入和删除元素的场景下，LinkedList 的性能通常比 ArrayList 更好。
     */
    @Test
    public void testLinedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove(2);
    }
}
