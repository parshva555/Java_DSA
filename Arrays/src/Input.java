import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int [] arr = new int[5];
        arr[0] = 234;
        arr[1] = 232;
        arr[2] = 22;
        arr[3] = 32;
        arr[4] = 21;
        // [234,232,22,32,21]  internally stored like this
        System.out.println(arr[3]);
        System.out.println("Input nums:");
        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // printing using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        } // This is the normal for loop

        for (int j : arr) {
            System.out.print(j + " ");
        } // This is the enhanced for loop which intellijea converts for us
        // Both the for loops represent the same thing just with different codes .
        // One is normal and other one is enhanced.
        System.out.println("/n");
        System.out.println(Arrays.toString(arr)); // Converts the whole array into a String and displays


        System.out.println("Input str:");
        // array of objects
        String [] str = new String[4];
        for (int i = 0; i <str.length ; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
