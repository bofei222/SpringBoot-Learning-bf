package com.bf.springbootelasticsearch.controller;

import com.bf.springbootelasticsearch.entity.GoodsInfo;
import com.bf.springbootelasticsearch.repository.GoodsRepository;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author bofei
 * @Date 2019/5/21 16:24
 * @Description
 */
@RestController
public class GoodsController {
    @Autowired
    private GoodsRepository goodsRepository;

    //http://localhost:8888/save
    @GetMapping("save")
    public String save(){
        GoodsInfo goodsInfo = new GoodsInfo(System.currentTimeMillis(),
                "商品"+System.currentTimeMillis(),"这是一个测试商品");
        goodsRepository.save(goodsInfo);
        return "success";
    }

    //http://localhost:8888/delete?id=1525415333329
    @GetMapping("delete")
    public String delete(long id){
        goodsRepository.deleteById(id);
        return "success";
    }

    //http://localhost:8888/update?id=1525417362754&name=修改&description=修改
    @GetMapping("update")
    public String update(long id,String name,String description){
        GoodsInfo goodsInfo = new GoodsInfo(id,
                name,description);
        goodsRepository.save(goodsInfo);
        return "success";
    }




}
