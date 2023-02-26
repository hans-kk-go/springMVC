package com.has.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration //标志该类是spring的核心配置类
//<context:component-scan base-package="com.has"/>
@ComponentScan("com.has")

//<context:property-placeholder location="classpath:jdbc.properties"></context:property-placeholder>
@PropertySource("classpath:jdbc.properties")

public class Springconfigration {

}
