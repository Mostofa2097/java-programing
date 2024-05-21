package com.bd;

public class Teacher extends Human {

    public Teacher(String name,int age,char gender){
        super(name, age, gender);

    }
    public void display() {
        super.display();
        System.out.println("Role: Teacher");
    }

}
