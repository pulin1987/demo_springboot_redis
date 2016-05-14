package com.liubo.demo.redis.controller;

import com.liubo.demo.redis.model.User;
import com.liubo.demo.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/5/13.
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/{userId}")
    @ResponseBody
    public User getUserById(@PathVariable("userId") String userId) {

        return userService.getUserById(userId);
    }

}
