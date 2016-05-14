package com.liubo.demo.redis.controller;

import com.liubo.demo.redis.model.User;
import com.liubo.demo.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

/**
 * Created by Administrator on 2016/5/13.
 */
@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("{userId}")
    public User getUserById(@PathVariable("userId") String userId) {

        return userService.getUserById(userId);
    }

//    @RequestMapping(value = "update")
//    public String updateUser(@RequestParam(required = true) String userId,
//                             @RequestParam Integer age,
//                             @RequestParam String name,
//                             @RequestParam String address) {
//        User user = new User();
//        user.setUserId(userId);
//        user.setAge(age);
//        user.setName(name);
//        user.setAddress(address);
//        boolean result = userService.modifyUser(user);
//        return result + "";
//    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String updateUser(@RequestBody User user) {
        boolean result = userService.modifyUser(user);
        return result + "";
    }

}
