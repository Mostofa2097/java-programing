package assignment.two;

import java.util.Scanner;

public class ArithmeticOperatore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st number");
        int n1 = input.nextInt();
        System.out.println("enter 2nd number");
        int n2 = input.nextInt();
        int sum = n1+n2;
        int sub = n1-n2;
        int mul = n1*n2;
        int div = n1/n2;


        System.out.println("sum : "+sum);
        System.out.println("sub : "+sub);
        System.out.println("mul : "+mul);
        System.out.println("div : "+div);

        System.out.println("enter 1st number");
        double n3 = input.nextDouble();
        System.out.println("enter 2nd number");
        double n4 = input.nextDouble();

        double sum1 = n3+n4;
        double sub2 = n3-n4;
        double mul3 = n3*n4;
        double div4 = n3/n4;


        System.out.println("sum1 : "+sum1);
        System.out.println("sub2 : "+sub2);
        System.out.println("mul3 : "+mul3);
        System.out.println("div4 : "+div4);
    }
}
