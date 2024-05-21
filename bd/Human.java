package com.bd;

public class Human {
    String name;
    int age;
    char gender;
    Human(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age :"+age);
        System.out.println("gender : "+gender);
    }

}



