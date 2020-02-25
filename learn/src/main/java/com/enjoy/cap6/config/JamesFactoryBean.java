package com.enjoy.cap6.config;

import com.enjoy.cap6.Monkey;
import org.springframework.beans.factory.FactoryBean;

public class JamesFactoryBean implements FactoryBean<Monkey> {
    @Override
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }
}
