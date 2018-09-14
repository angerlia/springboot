package com.anger.test_monday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestMondayApplication {


    //过滤器
//    @Bean
//    public FilterRegistrationBean serverFilterRegistrationBean(){
//        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
//        ServerFilter mLoginFilter = new ServerFilter();   //new过滤器
//        filterRegistrationBean.setFilter(mLoginFilter);       //set
//        filterRegistrationBean.addUrlPatterns("/*");    //set
//        filterRegistrationBean.setOrder(0);
//        return filterRegistrationBean;
//    }
    public static void main(String[] args) {
        SpringApplication.run(TestMondayApplication.class, args);
    }
}
