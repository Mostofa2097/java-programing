package assignment.three;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] element = new int[7];
        System.out.println("enter the velues");
        for (int i =0;i<7;i++){
            element[i]= input.nextInt();
        }
        System.out.println("Searching :");

        int search_element = input.nextInt();
        boolean status = false;
//        for(int i = 0; i<element.length;i++){
//            if(element[i]==search_element){
//                System.out.println("Number is found");
//                status=true;
//                break;
//            }
//
//        }

        for (int x:element){
            if(x==search_element){
                System.out.println("Number is found");
                status=true;
                break;
            }
        }

        if(status == false){
            System.out.println("Number is Not found");
        }
    }
}
