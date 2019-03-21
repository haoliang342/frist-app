package com.neusoft.fristapp.interceptor;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: title
 * Description:  spring boot 2.0，Spring 5.0
 *              使用新版WebMvcConfigurationSupport来代替
 *              老版 WebMvcConfigurerAdapter ，
 *              解决 格式化数据和中文字符串乱码不能同时使用的问题。
 * Created on 2019/2/26
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Configuration
public class FastJsonInterceptor extends WebMvcConfigurationSupport {
     /**
       * @author: haol
       * @method  利用fastjson替换掉jackson，且解决中文乱码问题
       * @description 
       * @date: 2019/3/18 18:46
        * @param
       * @return 
      */
     @Override
     public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
         FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
         FastJsonConfig fastJsonConfig = new FastJsonConfig();
         fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
         // 处理中文乱码问题
         List<MediaType> fastMediaTypes = new ArrayList<>();
         fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
         fastConverter.setSupportedMediaTypes(fastMediaTypes);
         fastConverter.setFastJsonConfig(fastJsonConfig);
         converters.add(fastConverter);
     }


}
