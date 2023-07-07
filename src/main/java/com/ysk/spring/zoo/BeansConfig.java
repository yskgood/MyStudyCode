package com.ysk.spring.zoo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ysk
 * @date 2023/6/27 8:05 PM
 */
@Configuration
public class BeansConfig {

    @Bean
    public Duck duck() {
        return new Duck();
    }
}
