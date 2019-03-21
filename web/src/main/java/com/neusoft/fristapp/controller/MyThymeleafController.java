package com.neusoft.fristapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/3/20
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@RestController
@RequestMapping("/myThymeleaf")
public class MyThymeleafController {

    @RequestMapping("/hello")
    public ModelAndView hello(Map<String,Object> map){
        //Map<String,Object> map = new HashMap<>();
        map.put("name","haol");
        ModelAndView modelAndView = new ModelAndView("hello");
       // modelAndView.addAllObjects(map);
        return modelAndView;
    }
}
