package com.neusoft.fristapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描该包下相应的class，主要是mybatis的持久化
@MapperScan("com.neusoft.fristapp.mapper")
public class FristAppApplication{

	public static void main(String[] args) {
		SpringApplication.run(FristAppApplication.class, args);
	}
}
