package com.bf.springbootmybatis.mapper;

import com.bf.springbootmybatis.entity.ClauseDefault;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

//@org.apache.ibatis.annotations.Mapper
public interface ClauseDefaultMapper extends Mapper<ClauseDefault> {
    @Select("select * from clause_default")
    List<ClauseDefault> getList();
}