
package com.weather.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {
        JpaRepositoriesAutoConfiguration.class
})
@ComponentScan( basePackages={"com.weather.*"})
@EnableWebMvc
public class Application {

    public static void main(String[] args) throws Exception {
    	SpringApplication.run(Application.class, args);
        
        //WeatherService weatherService = ctx.getBean(WeatherService.class);
        
    }

}
