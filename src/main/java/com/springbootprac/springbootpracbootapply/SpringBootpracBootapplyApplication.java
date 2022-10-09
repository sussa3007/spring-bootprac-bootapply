package com.springbootprac.springbootpracbootapply;

import com.springbootprac.springbootpracbootapply.properties.MyProperties;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ConfigurationPropertiesScan
@RequiredArgsConstructor
public class SpringBootpracBootapplyApplication {
//    @Value("${my.height}")
//    private final Integer height;
//    private final Environment environment;
//    private final ApplicationContext applicationContext;
    private final MyProperties myProperties;
//    public SpringBootpracBootapplyApplication(
//            @Value("${my.height}") Integer height,
//            Environment environment,
//            ApplicationContext applicationContext,
//            MyProperties myProperties
//    ){
//        this.height = height;
//        this.environment = environment;
//        this.applicationContext = applicationContext;
//        this.myProperties = myProperties;
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootpracBootapplyApplication.class, args);
    }

    @PostConstruct
    public void init() {
//        System.out.println("height = " + height);
//        System.out.println("Enviroment = " + environment.getProperty("my.height"));
//        System.out.println("ApplicationContext = " + applicationContext.getEnvironment().getProperty("my.height"));
        System.out.println("ConfigurationProps = " + myProperties.getHeight());
    }

}
