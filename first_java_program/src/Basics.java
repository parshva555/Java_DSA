import java.util.Scanner;

public class Basics
{
    public static void main(String[] args) {
        int a = 10;
        if ( a == 10){
            System.out.println("Parshva Dani is the Best");
        }

        int count = 1;
        while(count != 5){
            System.out.println(count);
            count++;
        }

        for (int count1= 1 ; count1 < 10; count1 ++){
            System.out.println("Counter is " + count1);
        }

        //Degree Celcius to Farheinheit

        Scanner input = new Scanner (System.in);
        System.out.println("Enter temperature in Celcius");
        float celcius = input.nextFloat();
        float fareinheit = ( celcius * 9/5) + 32;
        System.out.println(fareinheit);
    }
}
