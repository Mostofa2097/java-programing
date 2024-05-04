package assignment.three;

public class TowDimentionalArray {
    public static void main(String[] args) {

        int[][] array3 = new int[4][3];
        array3[0][0]=100;
        array3[0][1]=100;
        array3[0][2]=100;
        array3[1][0]=100;
        array3[1][1]=100;
        array3[1][2]=100;
        array3[2][0]=100;
        array3[2][1]=100;
        array3[2][2]=100;
        array3[3][0]=100;
        array3[3][1]=100;
        array3[3][2]=100;


        System.out.println(array3[2][2]);

        int [][] array4 = {{12,32,434},
                {312,213,123},
                {123,23,230},
                {123,321,210}
                    };
        System.out.println(array4[2][2]);
        for(int i = 0 ; i<4 ; i++){
            for(int j = 0 ; j <3 ; j++){
                System.out.println(array4[i][j]);
            }
        }

        for(int arr[]:array3){
            for(int x:arr){
                System.out.println(x);
            }
        }


    }
}
