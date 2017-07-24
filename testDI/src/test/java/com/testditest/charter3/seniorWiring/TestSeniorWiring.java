package com.testditest.charter3.seniorWiring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import testdi.charter3.seniorWiring.Company;
import testdi.charter3.seniorWiring.Engineer;
import testdi.charter3.seniorWiring.SeniorWiringConfig;

/**
 * ��web����������profile������dispatcherServlet��webContext������������JVM���Ե�
 * ����web.xml������
 * <context-param>
 *      <param-name>spring.profiles.default</name>
 *      <param-value>prod</value>
 * <context-param/>
 * Created by thomas on 2017/7/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {SeniorWiringConfig.class})
@ContextConfiguration(value = {"classpath:testdi.charter3.seniorWiring/SeniorWiringConfig.xml"})
@ActiveProfiles("qa")
public class TestSeniorWiring {

    @Autowired
    private Company company;
    @Autowired
    private Engineer engineer;

    @Test
    public void testProfile()
    {
        System.out.println(company.toString());
        System.out.println(engineer.toString());
    }
}
