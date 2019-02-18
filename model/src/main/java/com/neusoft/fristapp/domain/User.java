package com.neusoft.fristapp.domain;

/**
 * Title: title
 * Description: 用户实体类
 * Created on 2019/2/17
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
public class User {

    private int userId;

    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
