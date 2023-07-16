package com.ysk.spring.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author ysk
 * @date 2023/7/14 5:31 PM
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    /**
     * 在Spring容器实例化Bean之前动态注册BeanDefinition
     *
     * @param registry the bean definition registry used by the application context
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("BeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry:");
    }

    /**
     * BeanFactoryPostProcessor的实现类可以在BeanFactory加载BeanDefinition之后、实例化任何Bean之前，对BeanDefinition对象进行修改或者添加。
     * 通过BeanFactoryPostProcessor可以实现如下一些功能：
     * 1、修改BeanDefinition属性，如修改Bean的作用域、延迟加载等属性。
     * 2、注册自定义的BeanDefinition，如注册新的BeanDefinition或者替换已有的BeanDefinition。
     *
     * @param beanFactory the bean factory used by the application context
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor.postProcessBeanFactory");
    }

}
