package com.neusoft.fristapp.service;

import com.neusoft.fristapp.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title: title
 * Description: 用户业务层
 * Created on 2019/2/17
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Service
public class UserService {

    @Autowired
    private UserDao userdao;

    public String getUserNameById(int userId){
        return userdao.getUserName(userId);
    }

}
