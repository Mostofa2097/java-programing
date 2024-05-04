package assignment.two;

import java.util.Scanner;

public class UnaryOperatore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        System.out.println("Result : " + a);
        System.out.println("The number is : " + a++);
        System.out.println("Result : " + a);
        System.out.println("The number is : " + ++a);
        System.out.println("Result : " + a);
        System.out.println("The number is : " + a--);
        System.out.println("Result : " + a);
        System.out.println("The number is : " + --a);
        System.out.println("Result : " + a);



    }
}
