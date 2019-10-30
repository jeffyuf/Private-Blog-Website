package com.yufei.myblog.dao;

import com.yufei.myblog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Yufei on 10/25/19 5:37 PM
 * for project myblog
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
