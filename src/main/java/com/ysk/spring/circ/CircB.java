package com.ysk.spring.circ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Spring解决循环依赖主要是依赖三级缓存，但是的在调用构造方法之前还未将其放入三级缓存之中，因此后续的依赖调用构造方法的时候并不能从三级缓存中获取到依赖的Bean，因此不能解决。
 *
 * @author ysk
 * @date 2023/7/3 8:26 PM
 */

//@Service
public class CircB {
    private CircA a;

    public CircB(CircA a) {
        this.a = a;
    }

    public void say() {
        System.out.println("CircB");
    }
}
