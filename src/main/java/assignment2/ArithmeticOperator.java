package assignment2;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("inter two numder");
        int a = input.nextInt();
        int b= input.nextInt();

        int  add =(a+b);
        int  sub =(a-b);
        int  mul =(a*b);
        int  div =(a/b);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);



    }
}
