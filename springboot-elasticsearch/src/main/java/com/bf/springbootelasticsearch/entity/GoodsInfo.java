package com.bf.springbootelasticsearch.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author bofei
 * @Date 2019/5/21 16:23
 * @Description
 */
@Data
@Document(indexName = "testgoods",type = "goods")
public class GoodsInfo {
    private Long id;
    private String name;
    private String description;

    public GoodsInfo(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public GoodsInfo() {
    }
}
