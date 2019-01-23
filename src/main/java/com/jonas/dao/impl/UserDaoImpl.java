package com.jonas.dao.impl;

import com.jonas.config.BaseDao;
import com.jonas.dao.UserDao;
import com.jonas.entity.User;
import org.springframework.stereotype.Repository;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2019/01/23
 */
@Repository
public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User getUser(Long id) {
        return this.getHibernateTemplate().get(User.class, id);
    }
}
