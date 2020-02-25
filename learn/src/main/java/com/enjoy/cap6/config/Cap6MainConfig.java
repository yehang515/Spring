package com.enjoy.cap6.config;

import cap1.Person;
import com.enjoy.cap6.Cat;
import com.enjoy.cap6.Dog;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {Dog.class, Cat.class, JamesImportSelector.class, JamesFactoryBean.class})
public class Cap6MainConfig {

    /**
     * 给容器中注册组件的方式
     * 1， @Bean :  导入第三方的类或者包的组件
     * 2， 包扫描+组件的标注注解（@ComponentScan: @Controller, @Service,@Reponsitory,@Componet）,一般自己写的类
     * 3， @Import 能够快速给容器导入组件。注意：@Bean有点简单
     * @ImportSelect
     * @return
     */
    @Bean("person")
    public Person person(){
        return new Person("kyle",30);
    }
}
