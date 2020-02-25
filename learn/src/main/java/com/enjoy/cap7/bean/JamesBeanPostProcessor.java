package com.enjoy.cap7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class JamesBeanPostProcessor implements BeanPostProcessor {

     @Override
     public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
         System.out.println("postProcessBeforeInitialization..." + beanName);
        return bean;
    }

     @Override
     public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
         System.out.println("postProcessAfterInitialization..." + beanName);
         return bean;
    }
}
