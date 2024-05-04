package assignment.two;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int a= input.nextInt();
        for (int i = 0 ; i <=a; i++ ){
            System.out.println(i);
        }

    }
}
