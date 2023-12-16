package easy;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sum(213121);
        System.out.println("The sum of the digits is :"+ ans);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n%10)+ sum(n/10);
        }
    }
}
