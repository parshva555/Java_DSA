import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input A:");
        int a = input.nextInt();
        System.out.println("Input B:");
        int b = input.nextInt();
        System.out.println("Input C:");
        int c = input.nextInt();

        // Find the largest of the 3 numbers

        if (a > b && a > c){
            System.out.print(a + " i.e a is the largest number");
        }
        else if (b > a && b > c){
            System.out.print(b + " i.e b is the largest number");
        }
        else{
            System.out.print(c + " i.e c is the largest number");
        }
    }
}
