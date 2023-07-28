package com.ysk.spring.aop;

/**
 * 定义真实对象和代理对象的共同接口
 *
 * @author ysk
 * @date 2023/7/18 6:56 PM
 */
public interface Subject {
    void request();
    void  hello();
}

