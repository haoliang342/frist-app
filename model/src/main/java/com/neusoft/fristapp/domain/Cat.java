package com.neusoft.fristapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Title: title
 * Description: 如何进行持久化？
 *              1.使用@Entity进行实体类的持久化操作，当JPA检测到我们的实体类当中有
 *              @Entity的注解，会在数据库中生成对应的表结构信息。
 *
 *              如何指定主键
 *              2.使用@ID指定主键,使用@GeneratedValue(strategy = GenerationType.AUTO)
 *              指定主键的生成策略，mysql默认的是自增长。
 *
 *
 * Created on 2019/2/28
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Entity
public class Cat {

    //使用@ID指定主键
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    //JPA提供的四种标准用法为TABLE,SEQUENCE,IDENTITY,AUTO.
    //TABLE：使用一个特定的数据库表格来保存主键。
    //SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。
    //IDENTITY：主键由数据库自动生成（主要是自动增长型）
    //AUTO：主键由程序控制。

    private int id;

    private String catName;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
