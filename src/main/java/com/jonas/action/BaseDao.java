package com.jonas.action;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import javax.annotation.Resource;

/**
 * 【 enter the class description 】
 *
 * @author shenjy 2019/01/23
 */
public class BaseDao extends HibernateDaoSupport {

    @Resource
    public void setHibernateTemplate(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

}
