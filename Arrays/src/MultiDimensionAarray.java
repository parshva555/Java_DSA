import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionAarray {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
            This is a multidimensional array
         */
        int[][] arr = new int[3][];
        // Adding number of rows is mandatory not the number of columns
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6,78},
                {7, 8, 9,456,23}
        };
        System.out.println(Arrays.toString(arr1[2]));
        System.out.println(arr1[2][3]);
        System.out.println("Input Your 2D Array:");
        int [][] newarr = new int [3][3];
        // How to take input of multidimensional array
        for (int row = 0; row <newarr.length; row++) {
            for(int col = 0; col< newarr[row].length;col++){
                newarr[row][col] = in.nextInt();
            }
        }
        // To print the 2d Array
        System.out.println("Your Array is :");
        for (int row = 0; row <newarr.length; row++) {
            for(int col = 0; col< newarr[row].length;col++){
                System.out.print(newarr[row][col]+ " ");

            }
            System.out.println();
        }
    }
}
