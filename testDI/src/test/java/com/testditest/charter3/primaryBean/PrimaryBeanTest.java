package com.testditest.charter3.primaryBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Conditional;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import testdi.charter3.primaryBean.Book;

/**
 * Created by thomas on 2017/7/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:testdi.charter3.primaryBean/primaryBeanConfig.xml"})
@ActiveProfiles("iopl")
public class PrimaryBeanTest {

    @Autowired
    private Book book;

    @Autowired
    @Qualifier("freeBook")
    private Book book2;

    @Autowired
    @Qualifier("book")
    private Book book3;

    @Autowired
    @Qualifier("professionalBook")
    private Book book4;

    @Test
    public void testPrimary()
    {
        System.out.println(book.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());
    }
}
