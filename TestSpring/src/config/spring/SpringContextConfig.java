package config.spring;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"com.tomas.web"},excludeFilters={@Filter(type=FilterType.ANNOTATION,value=EnableWebMvc.class)})
@ImportResource(value="classpath:config/spring/SpringContextConfig.xml")
@EnableAspectJAutoProxy //相当于在xml文件中写<aop:aspectj-autoproxy>
public class SpringContextConfig
{

}
