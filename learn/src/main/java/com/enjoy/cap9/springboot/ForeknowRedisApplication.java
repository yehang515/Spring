package com.enjoy.cap9.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

//注意此处一定要添加，否则启动报错，因为我们没有配制数据源
@SpringBootApplication(exclude =DataSourceAutoConfiguration.class )
public class ForeknowRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForeknowRedisApplication.class, args);
    }

}