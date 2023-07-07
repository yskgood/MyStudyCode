package com.ysk.spring.xml;

/**
 * @author ysk
 * @date 2023/7/4 7:17 PM
 */
public class Client {

    private GreetingService greetingService;


    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void doSomething() {
        greetingService.sayGreeting();
    }
}
