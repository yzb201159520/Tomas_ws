package testdi.charter2.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by thomas on 2017/7/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:testdi.charter2.beans/SchoolAllConfigXML.xml"})
public class SchoolXmlTest {

    @Autowired
    private Students students2;
    @Autowired
    private Teacher teacher;

    @Test
    public void testStuTea()
    {
        System.out.println(students2.toString());
        System.out.println(teacher.toString());
    }
}
