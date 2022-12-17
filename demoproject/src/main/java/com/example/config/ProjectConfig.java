package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration //it indicates that the class has bean definition methods.
public class ProjectConfig {

    @Bean //specifies that it returns a bean to be managed by Spring context.
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }
}
