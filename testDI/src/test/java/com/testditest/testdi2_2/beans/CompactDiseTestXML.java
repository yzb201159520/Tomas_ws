package com.testditest.testdi2_2.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * �ڲ��Ե�ʱ��ʹ��classpathʧ���ˣ���Ϊ����test���ڣ����������Ļ������ļ��ǲ����ڶ�Ӧ�ļ�Ŀ¼�µ�
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
