package oop;

class A{
    int a=100;

    void display(){
        System.out.println(a);
    }
}
class B extends A{
    int b=200;
    void show(){
        System.out.println(b);
    }
}

class C extends B {
    int c = 600;
    void print(){
        System.out.println(c);
    }
}

class D extends A{
    void doit(int d){
        System.out.println(d);
    }
}





public class InhheritanceTypes {

    public static void main(String[] args) {
        //single inheritance
        B b1 = new B();
        System.out.println(b1.a);
        System.out.println(b1.b);
        b1.show();
        b1.display();
        //multiLevel Inheritance
        C cobj = new C();
        System.out.println(cobj.b);
        System.out.println(cobj.c);
        System.out.println(cobj.a);

        //HierarchyInheritance

        D d1 = new D();
        System.out.println(d1.a);
         d1.doit(500);

    }

}
