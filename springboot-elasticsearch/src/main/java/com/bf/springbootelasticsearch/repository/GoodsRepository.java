package com.bf.springbootelasticsearch.repository;

import com.bf.springbootelasticsearch.entity.GoodsInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author bofei
 * @Date 2019/5/21 16:23
 * @Description
 */
public interface GoodsRepository extends ElasticsearchRepository<GoodsInfo,Long> {
}
