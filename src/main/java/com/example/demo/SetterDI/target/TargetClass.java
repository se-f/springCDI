package com.example.demo.SetterDI.target;

import com.example.demo.SetterDI.beans.MyFirstClassInterface;

public class TargetClass {
    MyFirstClassInterface myFirstClass;

    public TargetClass() {
        System.out.println("TargetClass constructor");
    }

    public void setMyFirstClass(MyFirstClassInterface myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public void printHello() {
        System.out.println(myFirstClass.getHello());
    }
}
