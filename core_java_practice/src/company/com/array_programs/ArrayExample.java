package company.com.array_programs;

public class ArrayExample {
    public static void main(String[] args){

        // initialize  - way 1
        int[] array1 = new int[5];
        array1[0] = 5;
        array1[1] = 10;
        array1[2] = 20;
        array1[3] = 25;
        array1[4] = 30;

        // initialize  - way 2
        int[] array2 = new int[]{3,5,6,2,4};

        // initialize - way 3
        int[] array3 = {3,5,6,1,5,7};

        // Multidimensional Array

        int[][] multiarray = new int[3][3];
        multiarray[0][0] = 0;
        multiarray[0][1] = 1;
        multiarray[0][2] = 2;
        multiarray[1][0] = 3;
        multiarray[1][1] = 4;
        multiarray[1][2] = 5;
        multiarray[2][0] = 6;
        multiarray[2][1] = 7;
        multiarray[2][2] = 8;
    }
}
