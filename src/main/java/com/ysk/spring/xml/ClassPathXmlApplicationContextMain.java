package com.ysk.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ysk
 * @date 2023/7/4 7:19 PM
 */
public class ClassPathXmlApplicationContextMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Client client = context.getBean(Client.class);
        client.doSomething();
    }
}
