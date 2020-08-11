package com.luv2code.springdemo;

import com.luv2code.springdemo.MySecondCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

// caution : no upper case !
@PropertySource("classpath:sport.properties")

public class MySecondConfig {



    @Bean
    public MySecondFortuneService mySecondFortuneService(){
        return new MySecondFortuneService();
    }
    @Bean
    public MySecondCoach mySecondCoach(){
        return new MySecondCoach(mySecondFortuneService());
    }
}
