package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            System.out.println("And I wrote a new line");
            return;
        }

        System.out.println("I am not covered");
    }
}