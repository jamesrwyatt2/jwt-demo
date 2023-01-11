package com.jwctech.jwtdemo.service;

import com.jwctech.jwtdemo.entity.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService {

    String createUser(User user);

    User loadUserByUsername(String username)
            throws UsernameNotFoundException;
}
