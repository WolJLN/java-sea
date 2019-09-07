package com.iee.rbac.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.iee.rbac.shiro.mapper")
public class RabcShiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabcShiroApplication.class, args);
	}

}
