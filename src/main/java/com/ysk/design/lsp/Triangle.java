package com.ysk.design.lsp;

/**
 * @author ysk
 * @date 2023/6/12 8:57 PM
 */
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
