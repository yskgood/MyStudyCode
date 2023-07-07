package com.ysk.spring.circ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ysk
 * @date 2023/7/3 8:26 PM
 */
//@Service
public class CircA {
    private CircB b;

    public CircA(CircB b) {
        this.b = b;
    }

    public void say() {
        System.out.println("CircA");
    }
}
