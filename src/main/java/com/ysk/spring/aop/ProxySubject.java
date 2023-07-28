package com.ysk.spring.aop;

/**
 * @author ysk
 * @date 2023/7/18 7:06 PM
 */
public class ProxySubject implements Subject {
    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        beforeRequest();
        realSubject.request();
        afterRequest();
    }

    @Override
    public void hello() {
        realSubject.hello();
    }

    private void beforeRequest() {
        System.out.println("Proxy: Handling before request.");
    }

    private void afterRequest() {
        System.out.println("Proxy: Handling after request.");
    }

    /**
     * 静态代理的优点和缺点
     * 先看看代理模式的优点：
     * 扩展原功能，不侵入原代码。
     *
     * 再看看这种代理模式的缺点：
     * 假如有这样一个需求，有十个不同的RealObject，同时我们要去代理的方法是不同的，比要代理方法：doSomething、doAnotherThing、doTwoAnotherThing，这样才用静态代理就不合适了。
     * 解决办法是使用动态代理，在运行时根据需要生成代理类，这样就可以解决这个问题了。
     *
     * @param args
     */
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.request();
    }
}
