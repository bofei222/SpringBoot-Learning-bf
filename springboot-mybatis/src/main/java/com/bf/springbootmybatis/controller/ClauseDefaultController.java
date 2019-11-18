package com.bf.springbootmybatis.controller;

import com.bf.springbootmybatis.entity.ClauseDefault;
import com.bf.springbootmybatis.mapper.ClauseDefaultMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: bofei
 * @date: 2019-11-14 21:52
 **/
@RestController
@RequestMapping("/clause-default")
public class ClauseDefaultController {
    @Resource
    private ClauseDefaultMapper clauseDefaultMapper;

    @RequestMapping("/test")
    public String test() {
        List<ClauseDefault> clauseDefaults = clauseDefaultMapper.selectAll();
        System.out.println(clauseDefaults);

        List<ClauseDefault> clauseDefaultList = clauseDefaultMapper.selectAll();
        System.out.println(clauseDefaultList);

        List<ClauseDefault> list = clauseDefaultMapper.getList();
        System.out.println(list);

        List<ClauseDefault> all = clauseDefaultMapper.getAll();
        System.out.println(all);
        return "0216";
    }
}
