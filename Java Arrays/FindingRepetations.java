package assignment.three;

public class FindingRepetations {
    public static void main(String[] args) {
        int[] element = {12,4,56,4,3,56,4,2,34,35,4,23,23,4,5};
        int Find_element = 4;
        int count = 0;


        for (int x:element){
            if(x==Find_element){
                count++;
            }
        }
            System.out.println(" "+count);

    }
}
