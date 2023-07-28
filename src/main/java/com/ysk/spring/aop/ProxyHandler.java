package com.ysk.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 动态生成+代理模式，也就是动态代理。
 * @author ysk
 * @date 2023/7/18 7:38 PM
 */
public class ProxyHandler implements InvocationHandler {

    private Object target;

    public ProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeRequest();
        Object result = method.invoke(target, args);
        afterRequest();
        return result;
    }

    private void beforeRequest() {
        System.out.println("Proxy: Handling before request.");
    }

    private void afterRequest() {
        System.out.println("Proxy: Handling after request.");
    }

    public static void main(String[] args) {
        System.getProperties().setProperty("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        RealSubject realSubject = new RealSubject();
        Subject proxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, new ProxyHandler(realSubject));
        proxy.request();
        proxy.hello();
    }
}
