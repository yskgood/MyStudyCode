package com.ysk.design.lsp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 我们定义了一个抽象类Shape，它有一个抽象方法calculateArea()，这个方法在子类中进行实现。
 * Rectangle和Triangle分别实现了calculateArea()方法，并且确保子类对象可以替换父类对象而不影响程序的正确性
 *
 * @author ysk
 * @date 2023/6/12 8:58 PM
 */
class ShapeTest {

    @Test
    void calculateArea() {
        Shape shape1 = new Rectangle(10, 20);
        System.out.println(shape1.calculateArea());

        Shape shape2 = new Triangle(10, 20);
        System.out.println(shape2.calculateArea());
    }
}