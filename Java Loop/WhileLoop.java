package assignment.two;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int a= input.nextInt();
        int i = 0;
        while (i <= a) {
            System.out.println(i);
            i++;
        }
    }
}
