package com.bf.springbootelasticsearch.repository;

import com.bf.springbootelasticsearch.entity.Accounts;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author bofei
 * @Date 2019/5/21 15:56
 * @Description
 */
public interface AccountsRepository extends ElasticsearchRepository<Accounts, Long> {

}
