package config.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.tomas.web.controller.HomeController;

/**
 * SpringMVC的config
 * 主要用于处理handlerMapping和viewResolver
 * 所以不可避免的会扫描web.action中的类。而在Spring的ApplicationContext的config中，就排除了此类已经扫描的类，避免重复
 * @author thomas
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class})
@ImportResource(value={"classpath:config/spring/SpringMVCconfig.xml"})
public class SpringMVCConfig extends WebMvcConfigurerAdapter {
	
	/**
	 * JSP的视图解析器
	 * @return
	 */
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		// 这句话是设置可以将ApplicationContext中的Bean放在Request或者Session中的attribute中？
		viewResolver.setExposeContextBeansAsAttributes(true);
		viewResolver.setOrder(1);
		return viewResolver;
	}
	
	/**
	 * 配置视图解析
	 */
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
}
