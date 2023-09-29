import java.sql.SQLOutput;

public class FibonacciSeries {
    public static void main(String[] args) {
        int ans = fibo(6);
        System.out.println(ans);
    }
    static int  fibo (int n){
        //base condition
        if(n<2){
            return n;
        }
        // this is not tail recursion
        // since here addition is there
        return fibo(n-1) + fibo(n-2);

    }
}
