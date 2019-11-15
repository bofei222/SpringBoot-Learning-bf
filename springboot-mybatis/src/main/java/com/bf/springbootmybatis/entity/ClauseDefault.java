package com.bf.springbootmybatis.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "clause_default")
public class ClauseDefault {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    @Column(name = "otherwise_agree")
    private String spOtherwiseAgree;
}