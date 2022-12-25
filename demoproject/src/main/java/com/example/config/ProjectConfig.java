package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration //it indicates that the class has bean definition methods.
public class ProjectConfig {

    @Bean //specifies that it returns a bean to be managed by Spring context.
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Mercedes");
        return veh;
    }

    // for Example3
    //Providing custom name to the bean
    @Bean(name = "ferrariVehicle")
    Vehicle vehicle4(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Bean(value = "kiaVehicle")
    Vehicle vehicle5(){
        var veh = new Vehicle();
        veh.setName("Kia");
        return veh;
    }

    @Bean("RenaultVehicle")
    Vehicle vehicle6(){
        var veh = new Vehicle();
        veh.setName("Renault");
        return veh;
    }

    // for Example4
    // Primary sets the default
    @Primary
    @Bean("marutiVehicle")
    Vehicle vehicle7(){
        var veh = new Vehicle();
        veh.setName("Maruti");
        return veh;
    }
}
