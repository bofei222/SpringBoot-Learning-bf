package com.bf.springbootmybatis.service;

import com.bf.springbootmybatis.entity.Category;
import com.bf.springbootmybatis.entity.User;
import com.bf.springbootmybatis.mapper.CategoryMapper;
import com.bf.springbootmybatis.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @description:
 * @author: bofei
 * @date: 2019-08-22 16:01
 **/
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    @Resource
    private CategoryMapper categoryMapper;

    @Transactional
    public String getData(Integer id) {
        User user = userMapper.get(id);
        User user2 = userMapper.get(id);

        System.out.println("user" + user);
        System.out.println("user" + user2);
        Category category = categoryMapper.get(id);
        System.out.println(category);

        return user.toString() + category.toString();
    }

}
