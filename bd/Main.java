package com.bd;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kamal",23,'m');
        Teacher teacher = new Teacher("Anusul",40,'m');
        Parents parents = new Parents("Ali",50,'m');

        System.out.println("Student details :");
        student.display();
        System.out.println("Teacher details :");
        teacher.display();
        System.out.println("Parents details :");
        parents.display();



    }
}
