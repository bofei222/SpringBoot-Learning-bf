package com.bf.springbootelasticsearch.repository;

import com.bf.springbootelasticsearch.entity.Commodity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author bofei
 * @Date 2019/4/28 17:04
 * @Description
 */
@Repository
public interface CommodityRepository extends ElasticsearchRepository<Commodity, String> {

}