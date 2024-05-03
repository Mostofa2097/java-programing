package assignment.three;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {1,321,454,65,76,89,9870,6,56};
        System.out.println("Before sorting...");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting...");
        System.out.println(Arrays.toString(array));


        char[] array1 = {'a','d','r','f','t','k'};
        System.out.println("Before sorting...");
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("After sorting...");
        System.out.println(Arrays.toString(array1));


        String[] array3 = {"kfgd","jsdf","rrh","aqq","fefwe","wrw","dgrg","uku"};
        System.out.println("Before sorting...");
        System.out.println(Arrays.toString(array3));
        Arrays.sort(array3);
        System.out.println("After sorting...");
        System.out.println(Arrays.toString(array3));

    }
}
