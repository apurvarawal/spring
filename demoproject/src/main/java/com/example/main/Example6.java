package com.example.main;

import com.example.beans.Trees;
import com.example.config.ProjectConfig3;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example6 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);
        Trees peepal = new Trees();
        peepal.setName("Peepal");
        Supplier<Trees> peepalSupplier = () -> peepal;

        Supplier<Trees> mangoSupplier = () -> {
            Trees mango = new Trees();
            mango.setName("Mango");
            return mango;
        };

        Random random = new Random();
        int rndm = random.nextInt(10);
        System.out.println("Random no. = "+ rndm);

        if(rndm % 2 == 0){
            context.registerBean("peepal", Trees.class, peepalSupplier);
        }
        else {
            context.registerBean("mango", Trees.class, mangoSupplier);
        }

        //making new variables for each tree, so that we can store the value in them, from getName
        Trees peepalTree = null;
        Trees mangoTree = null;

        // we are using try catch to check if the bean exists or not.
        try {
            peepalTree = context.getBean("peepal", Trees.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("ERROR!! No such peepalTree bean found!!");
        }

        try{
            mangoTree = context.getBean("mango", Trees.class);
        }catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException){
            System.out.println("ERROR!! No such mangoTree bean found!!");
        }

        // we will check which bean has been registered, and run further commands accordingly.
        if(null != peepalTree){
            System.out.println(peepalTree.getName());
        } else {
            System.out.println(mangoTree.getName());
        }
    }
}
