package com.ysk.spring;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ysk
 * @date 2023/6/27 8:34 PM
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    private Map<Long, User> userMap = new HashMap<>();

    public UserRepositoryImpl() {
        userMap.put(1L, new User(1L, "ysk_01", "111@163.com"));
        userMap.put(2L, new User(2L, "ysk_02", "222@163.com"));
        userMap.put(3L, new User(3L, "ysk_03", "333@163.com"));
    }

    @Override
    public User findById(Long id) {
        return userMap.get(id);
    }
}
