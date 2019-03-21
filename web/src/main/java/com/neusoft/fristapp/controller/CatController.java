package com.neusoft.fristapp.controller;

import com.neusoft.fristapp.domain.Cat;
import com.neusoft.fristapp.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Title: title
 * Description: [描述]
 * Created on 2019/3/19
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@RestController
@RequestMapping("/cat")
public class CatController {

    @Autowired
    private CatService catService;

    @RequestMapping(value = "/save")
    public String save(){
        Cat cat = new Cat();
        cat.setAge(19);
        cat.setCatName("aaaaa");
        catService.save(cat);
        return "save success";
    }

    @RequestMapping(value = "/findCatByName/{name}")
    public Cat findCatByName(@PathVariable("name")String name){
        Cat cat = catService.findByCatName(name);
         return cat;
    }

    @RequestMapping(value = "/queryCatByName/{name}")
    public Cat queryCatByName(@PathVariable(value = "name")String name){
        Cat cat = catService.findMyCatName(name);
        return cat;
    }

}
