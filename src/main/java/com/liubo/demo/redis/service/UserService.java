package com.liubo.demo.redis.service;

import com.liubo.demo.redis.model.User;


/**
 * Created by Administrator on 2016/5/13.
 */

public interface UserService {

    /**
     *查询用户信息
     * @param userId
     * @return
     */
    public User getUserById(String userId);


    /**
     * 更新用户信息
     * @param user
     * @return
     */
    public  boolean modifyUser(User user);

}
