package com.yufei.myblog.service;

import com.yufei.myblog.dao.UserRepository;
import com.yufei.myblog.po.User;
import com.yufei.myblog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Yufei on 10/25/19 5:08 PM
 * for project myblog
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    // Look up database to validate user login
    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
