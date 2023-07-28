package com.ysk.spring.aop;

/**
 * 真实对象：实现共同接口的具体实现
 * @author ysk
 * @date 2023/7/18 6:57 PM
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }

    @Override
    public void hello() {
        System.out.println("RealSubject: Handling hello.");
    }
}
