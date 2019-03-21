package com.neusoft.fristapp.service;

import com.neusoft.fristapp.domain.Demo;
import com.neusoft.fristapp.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/3/21
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public Demo queryDemo(int id){
       return  demoMapper.queryDemo(id);
    }

}
