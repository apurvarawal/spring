package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String args[]){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        System.out.println("car is" + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class); //context variable is becoming equal to
                                                                                    //the ProjectConfig class from ProjectConfig java file.

        Vehicle veh = context.getBean(Vehicle.class); //we make a variable of type Vehicle and equal it to the bean which has vehicle class
        System.out.println("car is "+ veh.getName());
    }
}
