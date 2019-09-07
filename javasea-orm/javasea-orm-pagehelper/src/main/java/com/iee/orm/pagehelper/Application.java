package com.iee.orm.pagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.iee.orm.pagehelper.mapper")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
        System.err.println("sample started. http://localhost:8800/testfindUserListByPage?pageNum=1&pageSize=10");
    }

}
