package com.ysk.spring.aop.aspectJ;

import org.springframework.stereotype.Service;

/**
 * @author ysk
 * @date 2023/7/24 7:00 PM
 */
@Service
public class JdkProxyDemoServiceImpl implements IJdkProxyService {
    @Override
    public void doMethod1() {
        System.out.println("JdkProxyServiceImpl.doMethod1()");
    }

    @Override
    public String doMethod2() {
        System.out.println("JdkProxyServiceImpl.doMethod2()");
        return "hello world";
    }

    @Override
    public String doMethod3() throws Exception {
        System.out.println("JdkProxyServiceImpl.doMethod3()");
        throw new Exception("some exception");
    }
}
