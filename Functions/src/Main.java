import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(StringExample[] args) {
        // Q: Take Input of 2 numbers and print the sum
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int num1 = in.nextInt();
        System.out.println("Enter the Second Number:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is :" + sum);

    }
}