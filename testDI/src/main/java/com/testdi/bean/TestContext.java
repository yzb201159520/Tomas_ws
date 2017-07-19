package com.testdi.bean;

import com.testdi.bean.SimpleCOnfig.SimpleConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * test
 * Created by thomas on 2017/7/19.
 */
public class TestContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfig.class);
        BraveKnight braveKnight = context.getBean(BraveKnight.class);
        braveKnight.emarkOnQuest();
    }

    public static void doMethod()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        BraveKnight knight = context.getBean(BraveKnight.class);
        knight.emarkOnQuest();
    }
}
