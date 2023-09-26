import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isPrime(n));

        // Checking if number is armstrong or notr
//        int n = in.nextInt();
//        System.out.println(isArmStrong(n));

        //Printing all the armstrong numbers
        for (int i = 100; i < 1000; i++) {
            if(isArmStrong(i)){
                System.out.print(i + " ");
            }
        }
    }


    // Print all the 3 digit armstrong numbers
    // cube of individual digits and the sum of those is the numbers itself is known as an armstrong number
    static boolean isArmStrong(int n){
        int orignal = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            sum += rem*rem*rem;
        }
        if ( sum == orignal){
            return true;
        }
        else{
            return false;
        }
    }



    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int c =2;
        while(c * c <= n)
        {
            if(n % c == 0){
                return false;
            }
            c ++;
        }
        return c * c > n;
    }
}
