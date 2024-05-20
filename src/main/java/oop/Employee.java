package oop;

import java.util.Scanner;

public class Employee {

    int eid;
    String ename;
    String job;
    int salary;

    void display(){
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(salary);
    }

//    public static void main(String[] args) {
//        Employee emp1 = new Employee();
//        Scanner input = new Scanner(System.in);
//        emp1.eid = input.nextInt();
//        emp1.ename = input.next();
//        emp1.job = input.next();
//        emp1.salary = input.nextInt();
//        emp1.display();
//
//        Employee emp2 = new Employee();
//        Scanner input2 = new Scanner(System.in);
//        emp2.eid = input.nextInt();
//        emp2.ename = input.next();
//        emp2.job = input.next();
//        emp2.salary = input.nextInt();
//        emp2.display();
//
//
//    }

}
