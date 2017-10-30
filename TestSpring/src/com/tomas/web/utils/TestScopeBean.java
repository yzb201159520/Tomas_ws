package com.tomas.web.utils;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ���Ը���Scope��̬����Bean
 * Created by thomas on 2017/10/30.
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)// ÿ�λ�ȡʱ���ᴴ��һ��
public class TestScopeBean {
    public TestScopeBean() {
        System.out.println(" TestScopeBean ��ʵ��������");
    }
}
