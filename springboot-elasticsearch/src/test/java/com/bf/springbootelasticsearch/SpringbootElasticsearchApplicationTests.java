package com.bf.springbootelasticsearch;

import com.bf.springbootelasticsearch.entity.Commodity;
import com.bf.springbootelasticsearch.service.CommodityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootElasticsearchApplicationTests {

    @Autowired
    private CommodityService commodityService;

    @Test
    public void contextLoads() {
        System.out.println(commodityService.count());
    }

    @Test
    public void testInsert() {
        Commodity commodity = new Commodity();
        commodity.setSkuId("1501009001");
        commodity.setName("原味切片面包（10片装）");
        commodity.setCategory("101");
        commodity.setPrice(880);
        commodity.setBrand("良品铺子");
        commodityService.save(commodity);

        Commodity commodity1 = new Commodity();
        commodity1.setSkuId("1501009002");
        commodity1.setName("原味切片面包（6片装）");
        commodity1.setCategory("101");
        commodity1.setPrice(680);
        commodity1.setBrand("良品铺子");
        commodityService.save(commodity1);

        Commodity commodity2 = new Commodity();
        commodity2.setSkuId("1501009004");
        commodity2.setName("元气吐司850g");
        commodity2.setCategory("101");
        commodity2.setPrice(120);
        commodity2.setBrand("百草味");
        commodityService.save(commodity2);

    }

    @Test
    public void testDelete() {
        Commodity commodity = new Commodity();
        commodity.setSkuId("1501009002");
        commodityService.delete(commodity);
    }

    @Test
    public void testGetAll() {
        Iterable<Commodity> iterable = commodityService.getAll();
        iterable.forEach(e->System.out.println(e.toString()));
    }

    @Test
    public void testGetByName() {
        List<Commodity> list = commodityService.getByName("面包");
        System.out.println(list);
    }

    @Test
    public void testPage() {
        Page<Commodity> page = commodityService.pageQuery(0, 10, "切片");
        System.out.println(page.getTotalPages());
        System.out.println(page.getNumber());
        System.out.println(page.getContent());
    }
}
