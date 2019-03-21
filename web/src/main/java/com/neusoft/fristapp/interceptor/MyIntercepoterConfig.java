package com.neusoft.fristapp.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/2/26
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Configuration
public class MyIntercepoterConfig extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       // super.addInterceptors(registry);
        System.out.println("拦截器");
        //注册拦截器
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(
                new MyInterceptorHandler());
        interceptorRegistration.addPathPatterns("/**");

    }
}
