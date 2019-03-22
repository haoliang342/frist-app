package com.neusoft.fristapp.controller;

import com.github.pagehelper.PageHelper;
import com.neusoft.fristapp.domain.Demo;
import com.neusoft.fristapp.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/3/21
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/getDemo/{id}")
    public Demo getDemo(@PathVariable(value = "id") int id){
        Demo demo = demoService.queryDemo(id);
        return  demo;
    }

    @RequestMapping("/getNameList/{name}")
    public List<Demo> getNameList(@PathVariable(value = "name") String name){
        /**
         * 第一个参数是： 第几页
         * 第二个参数是： 每页获取的条数
         */
        PageHelper.startPage(1,2);
        List<Demo> demoList = demoService.queryDemoList(name);
        return  demoList;
    }
}
