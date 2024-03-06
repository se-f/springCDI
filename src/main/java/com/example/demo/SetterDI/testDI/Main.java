package com.example.demo.SetterDI.testDI;

import com.example.demo.SetterDI.target.TargetClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Create instance of IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TargetClass target = (TargetClass) context.getBean("target");

        target.printHello();
    }
}
