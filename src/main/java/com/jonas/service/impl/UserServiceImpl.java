package com.jonas.service.impl;

import com.jonas.dao.UserDao;
import com.jonas.entity.User;
import com.jonas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2019/01/23
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(Long id) {
        User user = userDao.getUser(id);
        return user;
    }
}
