package com.bf.utildemo.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.serializer.SerializeConfig;
import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void test1() {
        // 生产环境中，config要做singleton处理，要不然会存在性能问题
        User user = new User();
        user.setNameInfo("coder");
        user.setAgeInfo("28");
        SerializeConfig config = new SerializeConfig();
        config.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;
        String json = JSON.toJSONString(user, config);
        System.out.println(json);
        Assert.assertEquals("{\"age_info\":\"28\",\"name_info\":\"coder\"}", json);


        JSONObject jsonObject = JSON.parseObject(json);
        System.out.println(jsonObject);


    }
}
