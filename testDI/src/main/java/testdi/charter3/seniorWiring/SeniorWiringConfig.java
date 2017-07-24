package testdi.charter3.seniorWiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by thomas on 2017/7/24.
 */
//@ComponentScan
@Configuration
public class SeniorWiringConfig {

    // 约定 profile有：qa prod dev
    @Bean
    @Profile("prod")
    public Company prodCompany()
    {   Company company = new Company();
        company.setCompanyName("Production Company");
        company.setLocation("重庆");
        company.setOwnMoney(123);
        return company;
    }

    @Bean
    @Profile("qa")
    public Company qaCompany()
    {   Company company = new Company();
        company.setCompanyName("QA Company");
        company.setLocation("重庆QA");
        company.setOwnMoney(123);
        return company;
    }

    @Bean
    public Engineer engineer()
    {
        Engineer engineer = new Engineer();
        engineer.setCompany("Engineer Company");
        engineer.setName("Engineer Name");
        engineer.setWorkYear(23);
        return engineer;
    }
}
