package com.tpe;

import com.tpe.Thirdparty.InstructorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Random;

@Configuration
@ComponentScan("com.tpe")
@PropertySource("classpath:application.properties")
public class AppConfiguration {


    @Bean
    public InstructorService instructorService(){
        return  new InstructorService();
    }


    @Bean
    public Random random(){
        return new Random();
    }


}
