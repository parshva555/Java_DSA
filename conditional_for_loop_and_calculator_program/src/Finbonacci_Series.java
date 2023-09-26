import java.util.Scanner;

public class Finbonacci_Series {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("For How many numbers You want to find the fibonacci Search for : ");
        int n = input.nextInt();
        int count = 2;
        while( count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count ++;
        }
        System.out.println("The Fibonacci Number is :" + b);
    }
}
