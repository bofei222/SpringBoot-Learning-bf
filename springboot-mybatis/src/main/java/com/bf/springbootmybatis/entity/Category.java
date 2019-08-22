package com.bf.springbootmybatis.entity;

import lombok.Data;

/**
 * @description:
 * @author: bofei
 * @date: 2019-08-21 11:04
 **/
@Data
public class Category {
    Integer category_id;
    String category_name;
    String description;
}
