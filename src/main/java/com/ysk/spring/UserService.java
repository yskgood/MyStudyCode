package com.ysk.spring;

import org.springframework.stereotype.Service;

/**
 * @author ysk
 * @date 2023/6/27 8:35 PM
 */
@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }
}
