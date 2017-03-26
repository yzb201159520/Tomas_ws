package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"com.tomas.web"},excludeFilters={@Filter(type=FilterType.ANNOTATION,value=EnableWebMvc.class)})
@ImportResource(value="classpath:config/SpringContextConfig.xml")
public class SpringContextConfig {

}
