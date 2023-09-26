import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from user till use does not press x or X
        int ans =0;
        while(true){
            System.out.println("Enter the Operator:");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input 2 numbers
                System.out.println("Enter the first Number:");
                int num1 = input.nextInt();
                System.out.println("Enter the Second Number:");
                int num2 = input.nextInt();
                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '/'){
                    if (num2!=0){
                        ans = num1 / num2;
                    }
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            }
            else if(op == 'x' || op == 'X'){
                System.out.println("You have exited the program");
                break;
            }
            else{
                System.out.println("Invalid Operation");
            }
            System.out.println("The answer is " + ans);
        }
    }
}
