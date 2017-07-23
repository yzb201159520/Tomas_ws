package com.testditest.testdi2_2.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 在测试的时候使用classpath失败了，因为这是test包内，如果不编译的话，该文件是不会在对应文件目录下的
 * Created by thomas on 2017/7/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:com.testditest.testdi2_2.beans.CompactDiscConfigXML.xml"})
public class CompactDiseTestXML {

//    @Autowired
//    private CompactDisc compactDisc;

    @Test
    public void dotestCompactDisc()
    {
//        compactDisc.sayCompactDisc();
    }

}
