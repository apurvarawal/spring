package com.example.beans;

import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Laptop {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @PostConstruct
    public void initialize(){
        this.name = "Dell";
    }

    //Usually spring takes care of freeing the memory space by deleting on its own, but for some exceptional cases,
    //where it does not occur, we can use PreDestroy annotation.
    @PreDestroy // this deletes the bean and then the code under its method is executed.
    public void del(){
        System.out.println("Bean has been deleted.");
    }

    public static void printHello(){
        System.out.println("hello");
    }
}
