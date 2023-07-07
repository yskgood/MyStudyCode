package com.ysk.spring;

import com.alibaba.fastjson2.JSON;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ysk
 * @date 2023/6/27 8:39 PM
 */
public class UserServiceMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.ysk.spring");
        UserService service = context.getBean(UserService.class);
        User user = service.getUserById(1L);
        System.out.println(JSON.toJSONString(user));
    }
}
