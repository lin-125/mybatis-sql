package com.example.mybatissql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan({"com.example.mybatissql.test"})
@RestController
public class MybatisSqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisSqlApplication.class, args);
    }
    @RequestMapping("/index")
    public String index(){
        return "hello";
    }
}
