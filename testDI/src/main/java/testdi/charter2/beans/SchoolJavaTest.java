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
@ContextConfiguration(classes = {SchoolAllconfigJAVA.class})
public class SchoolJavaTest {
    @Autowired
    private Students students3;
    @Autowired
    private Teacher teacher;
    @Test
    public void testStuTea()
    {
        System.out.println(students3.toString());
        System.out.println(teacher.toString());
    }
}
