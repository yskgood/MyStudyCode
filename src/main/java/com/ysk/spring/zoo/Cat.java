package com.ysk.spring.zoo;

import com.ysk.spring.zoo.Animal;
import org.springframework.stereotype.Component;

/**
 * @author ysk
 * @date 2023/6/26 8:24 PM
 */
@Component
public class Cat implements Animal {
    @Override
    public void say() {
        System.out.println("I am a cat.");
    }
}
