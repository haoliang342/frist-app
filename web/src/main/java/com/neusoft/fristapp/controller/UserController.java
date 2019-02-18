package com.neusoft.fristapp.controller;

import com.neusoft.fristapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: title
 * Description: 用户Controller
 * Created on 2019/2/17
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "user/{userId}", method = RequestMethod.GET)
    public String getUsername(@PathVariable(value = "userId")int userId){
        String userName = userService.getUserNameById(userId);
        return userName;
    }
}
