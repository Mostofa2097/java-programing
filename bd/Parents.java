package com.bd;

import java.time.Period;

public class Parents extends Human{

    public Parents(String name,int age,char gender){
        super(name, age, gender);
    }
    public void display() {
        super.display();
        System.out.println("Role: Parents");
    }
}
