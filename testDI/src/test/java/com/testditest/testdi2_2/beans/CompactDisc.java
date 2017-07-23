package com.testditest.testdi2_2.beans;

import org.springframework.stereotype.Component;

/**
 * Created by thomas on 2017/7/23.
 */
@Component
public class CompactDisc {

    private String title = "Tomas Edison";
    private String context = " created the light";

    public void sayCompactDisc() {
        System.out.println(title + context);
    }

    public void sayCompactDisc2() {
        System.out.println(title + context);
    }
}
