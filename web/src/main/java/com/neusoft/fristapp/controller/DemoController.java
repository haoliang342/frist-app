package com.neusoft.fristapp.controller;

import com.neusoft.fristapp.domain.Demo;
import com.neusoft.fristapp.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
