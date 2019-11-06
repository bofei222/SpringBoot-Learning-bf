package com.bf.springbootmybatis.mapper;

import com.bf.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @description:
 * @author: bofei
 * @date: 2019-07-31 19:43
 **/
@Mapper
public interface UserMapper {


    @Select("SELECT * from user where id = 188")
    List<User> getList();

    @Select("SELECT * from user where id = #{id}")
    User get(Integer id);

    @Select("SELECT sex from user WHERE user_name = 'c'")
    List<String> getListByUserName();



    /**
     * @description 查询用户
     * @param name 名称
     * @return com.bf.springbootmybatis.entity.User
     * @author bofei
     * @date 2019/7/31 19:45
     */
    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO USER(user_name, sex) VALUES(#{name}, #{sex})")
    int insert(@Param("name") String name, @Param("sex") Integer sex);

    @Update("UPDATE user SET user_name = #{username} WHERE id = #{id}")
    int updateUser(User user);


}
