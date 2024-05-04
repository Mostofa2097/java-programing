package assignment.two;

import java.util.Scanner;

public class SwitcCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int a= input.nextInt();
        switch (a){
            case 1 :
                System.out.println("it is 1");
                break;
            case 2 :
                System.out.println("it is 2");
                break;
            case 3 :
                System.out.println("it is 3");
                break;
            case 4 :
                System.out.println("it is 4");
                break;
        }
    }
}
