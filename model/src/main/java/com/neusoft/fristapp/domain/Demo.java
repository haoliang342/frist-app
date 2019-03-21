package com.neusoft.fristapp.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/3/21
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Data
public class Demo {

    private long id;

    private String name;

    @JSONField(format = "yyyy-MM-DD")
    private Date createTime;
}
