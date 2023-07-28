package com.ysk.spring.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author ysk
 * @date 2023/7/14 5:30 PM
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {


    /**
     * 使用自定义的方式进行初始化，如果返回具体的Bean，则使用该Bean替换原来的Bean
     *
     * @param beanClass the class of the bean to be instantiated
     * @param beanName the name of the bean
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation");
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    /**
     *  自定义属性设置方式，替换默认的属性设置
     *
     * @param bean the bean instance created, with properties not having been set yet
     * @param beanName the name of the bean
     * @return
     * @throws BeansException
     */
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation");
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("InstantiationAwareBeanPostProcessor.postProcessProperties");
        return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
    }
}
