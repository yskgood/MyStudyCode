package com.ysk.spring.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author ysk
 * @date 2023/7/6 7:11 PM
 */
@Component
public class Life implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, EnvironmentAware, EmbeddedValueResolverAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;
    private Environment environment;

    public Life() {
        System.out.println("Life Constructor");
    }

    public void sayHello() {
        System.out.println("hello life");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware.setBeanName");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("BeanClassLoaderAware.setBeanClassLoader");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("BeanFactoryAware.setBeanFactory");
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        System.out.println("Environment.setEnvironment");
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.out.println("EmbeddedValueResolverAware.setEmbeddedValueResolver");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("ApplicationContextAware.setApplicationContext");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean.afterPropertiesSet");
    }

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean.destroy");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("PreDestroy");
    }
}
