package assignment.three;

import java.util.Scanner;

public class AllArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("inter elements");
        for (int i=0;i<5;i++){
            array[i]= input.nextInt();
        }

        System.out.println(array[1]);

        int[] array1 = {1,2,3,4,5,6};
        System.out.println(array1.length);
        System.out.println("element2 = "+array1[1]);
        System.out.println("All elements are:");

        for (int i = 0; i<array1.length ; i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println(" ");
        System.out.println("All elements are:");
        for (int i = 0; i<5 ; i++){
            System.out.println(array[i]+" ");
        }


        for(int  x:array1){
            System.out.print(x+" ");
        }
        System.out.println(" ");
        for(int  X:array){
            System.out.print(X+" ");
        }










    }
}
