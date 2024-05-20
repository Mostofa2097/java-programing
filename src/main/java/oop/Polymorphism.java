package oop;

public class Polymorphism {
    int x =10 ,y = 12;

    void some(){
        System.out.println("some : "+ (x+y));
    }

    void some(int x, int y){
        System.out.println("some : "+ (x+y));
    }
    void some(int x, double y){
        System.out.println("some : "+ (x+y));
    }
    void some(double x, int y){
        System.out.println("some : "+ (x+y));
    }
    void some(int x, int y, int z){
        System.out.println("some : "+ (x+y));
    }

}
