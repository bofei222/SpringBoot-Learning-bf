package com.bf.springbootelasticsearch.repository;

import com.bf.springbootelasticsearch.template.Day;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author bofei
 * @Date 2019/5/23 9:40
 * @Description
 */
public interface DayRepository extends ElasticsearchRepository<Day,String> {
}
