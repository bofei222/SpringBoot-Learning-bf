package com.bf.springbootelasticsearch.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @Author bofei
 * @Date 2019/5/21 15:45
 * @Description
 */
@Data
@Document(indexName = "accounts", type = "default")
public class Accounts {
    String title;
    String user;
    String desc;

}
