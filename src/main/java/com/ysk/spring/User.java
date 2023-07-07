package com.ysk.spring;

/**
 * @author ysk
 * @date 2023/6/27 8:34 PM
 */
public class User {
    private Long id; // 用户ID
    private String name; // 用户名
    private String email; // 用户邮箱

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
