package com.bf.springbootmybatis.mapper;

import com.alibaba.fastjson.JSONObject;
import com.bf.springbootmybatis.entity.Category;
import com.bf.springbootmybatis.entity.Category2;
import netscape.javascript.JSObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: bofei
 * @date: 2019-08-21 11:06
 **/
@Mapper
public interface CategoryMapper {

    @Select("select * from category where category_id = #{id}")
    Category get(Integer id);

    @Select("select * from category where category_id = #{id}")
    JSONObject getJSON(Integer id);

    @Select("select * from category where category_id = #{id}")
    Category2 get2(Integer id);


}
