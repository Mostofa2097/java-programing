package com.bd;

public class Student extends Human {

    public Student(String name,int age,char gender){
        super(name,age,gender);

    }
    public void display() {
        super.display();
        System.out.println("Role: Student");
    }
}
