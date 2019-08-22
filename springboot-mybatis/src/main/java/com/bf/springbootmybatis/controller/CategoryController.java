package com.bf.springbootmybatis.controller;

import com.alibaba.fastjson.JSONObject;
import com.bf.springbootmybatis.entity.Category;
import com.bf.springbootmybatis.entity.Category2;
import com.bf.springbootmybatis.mapper.CategoryMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: bofei
 * @date: 2019-08-21 11:07
 **/
@RestController
@RequestMapping("/categorys")
public class CategoryController {

    @Resource
    private CategoryMapper categoryMapper;

    @GetMapping("/{id}")
    public Category get(@PathVariable("id") Integer id) {
        return categoryMapper.get(id);
    }

    @GetMapping("/2/{id}")
    public Category2 get2(@PathVariable("id") Integer id) {
        return categoryMapper.get2(id);
    }

    @GetMapping("/3/{id}")
    public JSONObject getJSON(@PathVariable("id") Integer id) {
        return categoryMapper.getJSON(id);
    }
}
