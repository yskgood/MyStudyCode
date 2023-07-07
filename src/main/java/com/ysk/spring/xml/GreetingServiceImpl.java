package com.ysk.spring.xml;

/**
 * @author ysk
 * @date 2023/7/4 7:16 PM
 */
public class GreetingServiceImpl implements GreetingService {

    private String greeting;


    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public void sayGreeting() {
        System.out.println(greeting);
    }
}
