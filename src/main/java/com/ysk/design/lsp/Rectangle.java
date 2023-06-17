package com.ysk.design.lsp;

/**
 * @author ysk
 * @date 2023/6/12 8:56 PM
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
