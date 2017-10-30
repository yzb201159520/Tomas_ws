package com.tomas.web.utils;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 测试根据Scope动态创建Bean
 * Created by thomas on 2017/10/30.
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)// 每次获取时都会创建一次
public class TestScopeBean {
    public TestScopeBean() {
        System.out.println(" TestScopeBean 的实例创建了");
    }
}
