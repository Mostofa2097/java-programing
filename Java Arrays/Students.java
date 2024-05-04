package com.bd;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student stu = new Student();
        stu.name = "mostofa";
        stu.gender = "m";
        stu.id = 2097;
        stu.age = input.nextInt();

        System.out.println("name : " + stu.name);
        System.out.println("name : " + stu.gender);
        System.out.println("name : " + stu.id);
        System.out.println("name : " + stu.age);
    }
}
