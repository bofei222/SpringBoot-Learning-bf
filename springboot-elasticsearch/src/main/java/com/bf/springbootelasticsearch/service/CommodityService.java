package com.bf.springbootelasticsearch.service;

import com.bf.springbootelasticsearch.entity.Commodity;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author bofei
 * @Date 2019/4/28 17:05
 * @Description
 */
public interface CommodityService {

    long count();

    Commodity save(Commodity commodity);

    void delete(Commodity commodity);

    Iterable<Commodity> getAll();

    List<Commodity> getByName(String name);

    Page<Commodity> pageQuery(Integer pageNo, Integer pageSize, String kw);

}