package com.yxvk.hello.spring.boot.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.yxvk.hello.spring.boot.mybatis.mapper")
public class HelloSpringBootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootMybatisApplication.class, args);
    }

}
