package com.bf.springbootelasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @Author bofei
 * @Date 2019/4/28 17:01
 * @Description
 */
@Data
@Document(indexName = "commodity")
public class Commodity implements Serializable {

    @Id
    private String skuId;

    private String name;

    private String category;

    private Integer price;

    private String brand;

    private Integer stock;

}