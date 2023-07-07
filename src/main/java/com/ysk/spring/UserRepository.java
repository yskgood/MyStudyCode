package com.ysk.spring;

/**
 * @author ysk
 * @date 2023/6/27 8:33 PM
 */
public interface UserRepository {
    User findById(Long id);
}
