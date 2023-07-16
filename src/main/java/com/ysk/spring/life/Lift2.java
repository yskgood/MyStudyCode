package com.ysk.spring.life;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ysk
 * @date 2023/7/13 8:17 PM
 */
@Component
public class Lift2 {

    @Autowired
    private Life life;

    public Lift2() {
        System.out.println("Lift2 Constructor");
    }
}
