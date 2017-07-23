package com.testditest.compactDisc;

import com.testdi.bean.musicPro.CompactDiscConfig;
import com.testdi.bean.musicPro.SgtPeppers;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by thomas on 2017/7/20.
 */
public class TestDiscConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CompactDiscConfig.class);
        SgtPeppers sgtPeppers = context.getBean(SgtPeppers.class);
        sgtPeppers.play();
    }
}
