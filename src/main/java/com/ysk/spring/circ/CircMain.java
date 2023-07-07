package com.ysk.spring.circ;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ysk
 * @date 2023/7/3 8:28 PM
 */
public class CircMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.ysk.spring.circ");
        //CircA circA = (CircA) context.getBean("circA");
        // circA.say();
    }
}
