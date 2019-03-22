package com.neusoft.fristapp.service;

import com.neusoft.fristapp.domain.Demo;
import com.neusoft.fristapp.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
    /**
     *  1.@Autowired注解是按照类型（byType）装配依赖对象，
     *    默认情况下它要求依赖对象必须存在，如果允许null值，可以设置它的required属性为false
     *    如果我们想使用按照名称（byName）来装配，可以结合@Qualifier注解一起使用。
     *
     *  2.@Resource默认按照ByName自动注入，由J2EE提供，需要导入包javax.annotation.Resource。
     *    @Resource有两个重要的属性：name和type，而Spring将@Resource注解的name属性解析为
     *    bean的名字，而type属性则解析为bean的类型。所以，如果使用name属性，
     *    则使用byName的自动注入策略，而使用type属性时则使用byType自动注入策略。
     *    如果既不制定name也不制定type属性，这时将通过反射机制使用byName自动注入策略。
     *
     *  3.@Resource的作用相当于@Autowired，只不过@Autowired按照byType自动注入。
     *
     * */

    @Resource
    private DemoMapper demoMapper;

    public Demo queryDemo(int id){
       return  demoMapper.queryDemo(id);
    }

    public List<Demo> queryDemoList(String name){
        return  demoMapper.queryDemoList(name);
    }

}
