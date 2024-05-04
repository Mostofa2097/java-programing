package assignment.three;

import java.util.Scanner;

public class ReadArrayInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter array size");
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("add value");

        for (int i =0 ;i<n; i++){
            array[i] = input.nextInt();
        }

        for (int p=0 ; p<n ; p++){
            System.out.println(array[p]);
        }

    }
}
