package assignment.two;

import java.util.Scanner;

public class ternaryOperaotor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number ");
        int a = input.nextInt();
        System.out.println("enter another number ");
        int b = input.nextInt();
        int big = (a>b)?a:b;
        System.out.println("the biggest one is : " + big);
        int small = (a<b)?a:b;
        System.out.println("the smallest one is : " + small);
    }
}
