package com.ysk.spring.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ysk
 * @date 2023/6/26 8:25 PM
 */
@Component
public class Zoo {

    /*@Resource
    private Animal fish;*/

    @Resource(type = Cat.class)
    private Animal animal;

    @Autowired
    @Qualifier("dog")
    private Animal animal2;

    private Animal duck;

    public Zoo(Animal duck) {
        this.duck = duck;
    }

    public void show() {
        animal.say();
        animal2.say();
        duck.say();
        //fish.say();
    }
}
