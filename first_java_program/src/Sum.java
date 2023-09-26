
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the Second Number:");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("The Sum of the Two Numbers is "+sum);
        // Int is converted into float
        //        Scanner input = new Scanner(System.in);
        //        System.out.println("Enter The first number:");
        //        float num1 = input.nextInt();
        //        System.out.println("Enter the Second Number:");
        //        float num2 = input.nextInt();
        //        float sum = num1+num2;
        //        System.out.println("The Sum of the Two Numbers is "+sum);
        
        

    }
}
