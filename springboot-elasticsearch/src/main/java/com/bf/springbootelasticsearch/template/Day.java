package com.bf.springbootelasticsearch.template;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * @Author bofei
 * @Date 2019/5/23 9:31
 * @Description
 */
@Data
@Document(indexName = "dm_mkt_idx_day", type = "default")
public class Day implements Serializable {

    @Id
    private String issue;
    private String org_code;
    private String org_name;
    private String idx_code;
    private String idx_name;
    private String dim_type_ode;
    private String dim_code;
    private String dim_name;
    private String val;
    private String upd_time;
}



