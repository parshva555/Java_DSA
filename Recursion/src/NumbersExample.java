public class NumbersExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers
        print1(1);
    }
    static void print1(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
            System.out.println(n);


        // this is called tail recursion
        // this is the last function call
            print1(n+1);
    }
}
