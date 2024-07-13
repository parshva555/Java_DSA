package Polymorphism;
// Polymorphism - 2 types
// 1) Compile Time/ Static - method overloading
// 2) Run Time / Dynamic - method overriding
public class Numbers {
    // Mehthod Overloading
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.sum(2,3);
        num.sum(2,3,4);
        // num.sum(231,345,35,345); // Will give error at compile time only as there is
        // no function with 4 parameters\
    }

}
