package com.neusoft.fristapp.service;

import com.neusoft.fristapp.dao.CatRepository;
import com.neusoft.fristapp.domain.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/3/19
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Service
public class CatService {

    @Autowired
    private CatRepository catRepository;

    public void save(Cat cat){
        catRepository.save(cat);
    }

    public Cat findMyCatByName(String name){
       return null;
    }

    public Cat findByCatName(String name){
        return catRepository.findByCatName(name);
    }

    public Cat findMyCatName(String name){
        return catRepository.findMyCatName(name);
    }

}
