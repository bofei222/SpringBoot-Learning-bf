package com.bf.springbootmybatis.controller;

import com.bf.springbootmybatis.entity.User;
import com.bf.springbootmybatis.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: bofei
 * @date: 2019-08-21 10:43
 **/
@RestController
@RequestMapping("/users")
public class UserController {
    @Resource
    private UserMapper userMapper;

    @GetMapping("/")
    public List<User> getUserList() {
        List<User> list = userMapper.getList();
        System.out.println(list.size());

        return list;
    }


    @GetMapping("/list-by-username")
    public List<String> getListByUserName() {
        List<String> list = userMapper.getListByUserName();

        if (list.get(0) == null) {
            System.out.println("null");
        }
        if ("null".equals(list.get(0))) {
            System.out.println("字符串null");
        }

        System.out.println(list.size());
        return list;
    }

    @GetMapping("/{id}")
    public User getUserList(@PathVariable("id") Integer id) {
        User user = userMapper.get(id);

        System.out.println("user" + user);
        user.getId();
        return user;
    }
}
