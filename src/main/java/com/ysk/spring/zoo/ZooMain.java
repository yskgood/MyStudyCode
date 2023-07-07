package com.ysk.spring.zoo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ysk
 * @date 2023/6/26 8:26 PM
 */
public class ZooMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.ysk.spring.zoo");
        Zoo zoo = (Zoo) context.getBean("zoo");
        zoo.show();
    }
}
