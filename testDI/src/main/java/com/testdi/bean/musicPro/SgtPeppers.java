package com.testdi.bean.musicPro;

import org.springframework.stereotype.Component;

/**
 * CD的一个实现
 * Created by thomas on 2017/7/20.
 */
@Component
public class SgtPeppers implements CompactDisc{

    private static String title="Free Loop";
    private static String artist="Danel Porter";

    public void play() {
        System.out.println(title+" played by "+artist);
    }
}
