package testdi.charter2.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by thomas on 2017/7/24.
 */
@Configuration
@Import(value ={SchoolConfig.class})//��java��ʹ��@Import����������javaConfig
@ImportResource(value = {"classpath:testdi.charter2.beans/SchooConfig.xml"})//ʹ��@ImportResource����������XML�����ļ�
public class SchoolAllconfigJAVA {
}
