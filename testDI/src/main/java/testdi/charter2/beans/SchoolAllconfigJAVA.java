package testdi.charter2.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by thomas on 2017/7/24.
 */
@Configuration
@Import(value ={SchoolConfig.class})//在java从使用@Import导入其他的javaConfig
@ImportResource(value = {"classpath:testdi.charter2.beans/SchooConfig.xml"})//使用@ImportResource导入其他的XML配置文件
public class SchoolAllconfigJAVA {
}
