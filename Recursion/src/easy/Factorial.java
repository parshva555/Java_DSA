package easy;

public class Factorial {
    public static void main(String[] args) {
        int n = 6;
        int ans = factorial(n);
        System.out.println("The factorial of "+n+" is "+ans);
    }
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
            return n * factorial(n-1);
    }

}
