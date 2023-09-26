import java.util.Scanner;

public class Sum
{
    public static void main(String[] args) {
//        int ans  = sum2();
//        System.out.println("The sum is : "+ans);
        int answer = sum3(5 ,6);
        System.out.println("The Sum of the Two Numbers is  " + answer);
    }

    // pass the value of numbers when you are calling the method in main()  using parameters
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }
    // return the value so using int
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int num1 = in.nextInt();
        System.out.println("Enter the Second Number:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        return sum;
    }


    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int num1 = in.nextInt();
        System.out.println("Enter the Second Number:");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is :" + sum);
    }

    /*
    access modifier (we will look in OOP) return_type name (arguments){
        //body
        return statement;
    }
     */
}
