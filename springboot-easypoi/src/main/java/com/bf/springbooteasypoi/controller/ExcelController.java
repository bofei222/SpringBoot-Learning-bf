package com.bf.springbooteasypoi.controller;

import com.bf.springbooteasypoi.entity.Person;
import com.bf.springbooteasypoi.util.FileUtil;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author bofei
 * @Date 2019/6/16 17:39
 * @Description
 */
@RestController
public class ExcelController {

//    @RequestMapping("export")
//    public void export(HttpServletResponse response){
//
//        //模拟从数据库获取需要导出的数据
//        List<Person> personList = new ArrayList<>();
//        Person person1 = new Person("路飞","1",new Date());
//        Person person2 = new Person("娜美","2", DateUtils.addDate(new Date(),3));
//        Person person3 = new Person("索隆","1", DateUtils.addDate(new Date(),10));
//        Person person4 = new Person("小狸猫","1", DateUtils.addDate(new Date(),-10));
//        personList.add(person1);
//        personList.add(person2);
//        personList.add(person3);
//        personList.add(person4);
//
//        //导出操作
//        FileUtil.exportExcel(personList,"花名册","草帽一伙",Person.class,"海贼王.xls",response);
//    }

    @RequestMapping("/importExcel")
    public void importExcel(){
        String filePath = "E:\\海贼王.xlsx";
        //解析excel，
        List<Person> personList = FileUtil.importExcel(filePath,1,1,Person.class);
        System.out.println(personList);

        //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
        System.out.println("导入数据一共【"+personList.size()+"】行");

        //TODO 保存数据库
    }

}
