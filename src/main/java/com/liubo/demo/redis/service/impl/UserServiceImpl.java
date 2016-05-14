package com.liubo.demo.redis.service.impl;

import com.liubo.demo.redis.dao.UserDao;
import com.liubo.demo.redis.model.User;
import com.liubo.demo.redis.service.UserService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/5/14.
 */
@Service
public class UserServiceImpl implements UserService {

    private static final String USER_INFO = "USER_INFO_";
    @Resource
    private UserDao userDao;

    /**
     * @param userId
     * @return
     */
    //@Cacheable(value = "usercache", keyGenerator = "wiselyKeyGenerator")
    @Cacheable(value = "usercache", key = "#userId")
    public User getUserById(String userId) {
        User user = userDao.getUserById(userId);
        System.out.println("query DB...");
        return user;
    }

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    @Override
    @CacheEvict(value = "usercache", key = "#user.userId",beforeInvocation=true)
    public boolean modifyUser(User user) {
        if (user == null || StringUtils.isEmpty(user.getUserId())) {
            return false;
        }
        return userDao.updateUser(user) > 0;
    }
}
