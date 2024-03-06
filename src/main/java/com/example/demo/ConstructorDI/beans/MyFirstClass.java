package com.example.demo.ConstructorDI.beans;


public class MyFirstClass implements MyFirstClassInterface{

    public MyFirstClass() {
        System.out.println("MyFirstClass constructor");
    }
    public String getHello() {
        return "Hello from my first class CDI!";
    }
}
