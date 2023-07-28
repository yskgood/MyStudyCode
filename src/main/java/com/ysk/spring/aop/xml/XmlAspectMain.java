package com.ysk.spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ysk
 * @date 2023/7/19 8:39 PM
 */
public class XmlAspectMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aspects.xml");
        AopDemoServiceImpl service = context.getBean(AopDemoServiceImpl.class);
        // use configured instance
        service.doMethod1();
        service.doMethod2();
        try {
            service.doMethod3();
        } catch (Exception e) {
            // e.printStackTrace();
        }

        AopDemoServiceImpl2 serviceImpl2 = context.getBean(AopDemoServiceImpl2.class);
        serviceImpl2.doMethod1();
    }
}
