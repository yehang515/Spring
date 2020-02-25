package com.enjoy.cap7.config;

import com.enjoy.cap7.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.enjoy.cap7.bean")
@Configuration
public class Cap7MainConfigOfLifeCycle {

    @Bean (initMethod = "init", destroyMethod = "destory")
    public Bike bike(){
        return new Bike();
    }
}
