package Assignment1;

class A {
    int a,b; //instance variable
    static int c; //static variable

    void add(){
        int d=5; // local variable
        int sum = d+a;
        System.out.println(sum);
    }
}
public class Variables {

    public static void main(String[] args) {
        A a1 = new A();

        System.out.println(a1.a=10);
        System.out.println(a1.b=20);

        a1.add();

    }
}
