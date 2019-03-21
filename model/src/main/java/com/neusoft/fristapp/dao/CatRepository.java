package com.neusoft.fristapp.dao;

import com.neusoft.fristapp.domain.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


/**
 * Title: title
 * Description: [描述]
 * Created on 2019/3/19
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Repository
public interface CatRepository extends CrudRepository<Cat,Integer>{


    Cat findByCatName(String catName);

    @Query(value = "select c from Cat c where c.catName = :name")
    Cat findMyCatName(@Param("name") String name);

}
