package com.tomas.web.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;

/**
 * ��ȡapplicationContext�ķ�����������Spring��Context�У��ɻ�ȡspringMvc�ĺ�Spring�е�bean
 * ���⻹��Ҫ��spring-context��xml��������Ϣ
 * Created by thomas on 2017/10/30.
 */
public class ApplicationContextHolder implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext2) throws BeansException {
        ApplicationContextHolder.applicationContext=applicationContext2;
    }

    public static Object getBean(String beanName){
        return applicationContext.getBean(beanName);
    }

    public static <T>  T getBean(Class<T> clazz)
    {
        return applicationContext.getBean(clazz);
    }
}
