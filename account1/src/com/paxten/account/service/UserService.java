package com.paxten.account.service;

import com.paxten.account.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
