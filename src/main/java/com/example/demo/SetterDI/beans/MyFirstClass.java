package com.example.demo.SetterDI.beans;


public class MyFirstClass implements MyFirstClassInterface{

    public MyFirstClass() {
        System.out.println("MyFirstClass constructor");
    }
    public String getHello() {
        return "Hello from my first class!";
    }
}
