import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        Syntax (For Loop) :=
                for ( initialization; condition; increment/decrement ) {
                    Logic;
                }
         */
        // You Run For Loop when you know the condition
        // Print Numbers 1 to 5
        for(int number = 1; number <=5; number += 2){
            System.out.println("Number : " + number);
        }
        // Print Numbers 1 to n
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number You want : ");
        int n = input.nextInt();
        for(int counter = 0; counter <= n; counter += 10){
            System.out.println("Counter : " + counter);
        }


        /*
        While Loop Syntax
        while(condition){
            LOGIC
        }
        */
        // You Run while loop when you dont know tha condition
        int whilecount = 1;
        while(whilecount<=100){
            System.out.println("While Loop Count is " + whilecount);
            whilecount  = whilecount + 10;
        }

        // Do While Loop Syntax
        /*
            do{
                Logic
            } while(condition)
        */
        // The Do while loop will run atleast once
        //  Example
        //        int n = 1;
        //        do{
        //            System.out.println("Hello World");
        //        } while(n!=1);

        int dowhilenum = 1;
        do{
            System.out.println(dowhilenum);
            dowhilenum++;
        }while(dowhilenum<= 5);
    }
}
