package com.ysk.spring.zoo;

import com.ysk.spring.zoo.Animal;

/**
 * @author ysk
 * @date 2023/6/27 8:05 PM
 */
public class Duck implements Animal {
    @Override
    public void say() {
        System.out.println("I am a Duck.");
    }
}
