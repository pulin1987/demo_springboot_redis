package com.liubo.demo.redis.service;

import com.liubo.demo.redis.dao.UserDao;
import com.liubo.demo.redis.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/5/13.
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    /**
     *
     * @param userId
     * @return
     */
    @Cacheable(value = "usercache", keyGenerator = "wiselyKeyGenerator")
    public User getUserById(String userId) {
        User user = userDao.getUserById(userId);
        System.out.println("查询DB");
        return user;
    }


}
