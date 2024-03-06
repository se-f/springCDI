package com.example.demo.ConstructorDI.target;

import com.example.demo.ConstructorDI.beans.MyFirstClassInterface;

public class TargetClass {
    MyFirstClassInterface myFirstClass;

    public TargetClass(MyFirstClassInterface myFirstClass) {
        this.myFirstClass= myFirstClass;
        System.out.println("TargetClass constructor");
    }

    public void printHello() {
        System.out.println(myFirstClass.getHello());
    }
}
