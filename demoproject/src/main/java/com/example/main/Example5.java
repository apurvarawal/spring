package com.example.main;

import com.example.beans.Laptop;
import com.example.config.ProjectConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        Laptop laptop = context.getBean(Laptop.class);
        System.out.println(laptop.getName());
        Laptop.printHello();
        context.close(); //it calls the method under PreDestroy annotation and executes it.
    }
}
