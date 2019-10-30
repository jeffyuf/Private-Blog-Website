package com.yufei.myblog.service;

import com.yufei.myblog.po.User;

/**
 * Created by Yufei on 10/25/19 5:07 PM
 * for project myblog
 */
public interface UserService {

    User checkUser(String username, String password);
}
