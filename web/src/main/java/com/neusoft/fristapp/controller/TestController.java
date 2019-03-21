package com.neusoft.fristapp.controller;


import com.neusoft.fristapp.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/2/25
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@RestController
public class TestController {
     /**
       * @author: haol
       * @method  produces = "application/json; charset=utf-8" 防止字符串乱码
       * @description 
       * @date: 2019/3/18 18:54
        * @param
       * @return 
      */
    @RequestMapping(value = "/getuser/{num}",method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    public String getUser(@PathVariable(value = "num")String num){

        return  num;
    }

    @RequestMapping(value = "/getuser1/{num}",method = RequestMethod.GET)
    public User getUser1(@PathVariable(value = "num")String num){
        User user = new User();
        user.setUserId(1);
        user.setUserName("郝亮");
        user.setCreateTime(new Date());
        return  user;
    }
}
