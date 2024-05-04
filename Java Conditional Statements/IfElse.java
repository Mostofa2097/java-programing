package assignment.two;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int selery = input.nextInt();
        if(selery <= 50000 && selery>=46000){
            System.out.println("Nahid");
        } else if (selery <= 45000 && selery>=26000) {
            System.out.println("Shihab Dadu");
        } else if (selery <= 50000 && selery>=20000) {
            System.out.println("Shorif");
        }else{
            System.out.println("Mostofa");
        }
    }
}
