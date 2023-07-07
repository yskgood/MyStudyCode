package com.ysk.spring.life;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ysk
 * @date 2023/7/6 7:12 PM
 */
public class LifeMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.ysk.spring.life");
        Life life = context.getBean(Life.class);
        life.sayHello();
    }
}
