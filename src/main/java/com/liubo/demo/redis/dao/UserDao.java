package com.liubo.demo.redis.dao;

import com.liubo.demo.redis.model.User;

/**
 * Created by Administrator on 2016/5/14.
 */
public interface UserDao {

    /**
     * 获取用户信息
     *
     * @param user
     * @return
     */
    public User getUser(User user);

    /**
     * 根据用户ID获取用户信息
     *
     * @param userId
     * @return
     */
    public User getUserById(String userId);

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    public int updateUser(User user);
}
