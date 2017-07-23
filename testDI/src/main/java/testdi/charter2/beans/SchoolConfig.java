package testdi.charter2.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by thomas on 2017/7/24.
 */
@Configuration
public class SchoolConfig {

    @Bean
    public Teacher teacher()
    {
        int num = (int)(Math.random()*10);
        if (num>5)
        {
            return new Teacher();
        }
        return new Teacher("teacher1",32,null);
    }
}
