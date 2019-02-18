package com.neusoft.fristapp.dao;

import org.springframework.stereotype.Repository;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/2/17
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Repository
public class UserDao {

    /**
     * 根据用户ID查询用户名字
     * @param userId
     * @return
     */
    public String getUserName(int userId){
        if(userId ==  1){
            return "测试";
        }else {
            return "没有查出结果";
        }
    }

}
