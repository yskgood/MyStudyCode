package com.ysk.spring.aop.aspectJ;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ysk
 * @date 2023/7/24 7:06 PM
 */
public class AspectJMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.ysk.spring.aop.aspectJ");
        IJdkProxyService iJdkProxyService = context.getBean(IJdkProxyService.class);
        iJdkProxyService.doMethod1();
        iJdkProxyService.doMethod2();
        try {
            iJdkProxyService.doMethod3();
        } catch (Exception e) {
            //
        }

        CglibProxyDemoServiceImpl cglibProxyDemoService = context.getBean(CglibProxyDemoServiceImpl.class);
        cglibProxyDemoService.doMethod1();
        cglibProxyDemoService.doMethod2();
        try {
            cglibProxyDemoService.doMethod3();
        } catch (Exception e) {
            //
        }

    }
}
