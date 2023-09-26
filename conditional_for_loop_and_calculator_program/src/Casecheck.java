import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character you want to check if its Upper Case or Lower Case:");
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Upper Case");
        }
    }
}
