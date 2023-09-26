public class Shadowing {
    static int x = 90;  // this will be shadowed in line 5
    public static void main(String[] args) {
        System.out.println(x);  // 90
        int x = 40;  // the class variable at line 2 is shadowed by this
        // This is  only available in this block therefore the function below is going to print 90 only and not 40
        System.out.println(x);  // 40
        fun();
    }

    // Shadowing is basically using 2 variables with the same name within the scope tha overlaps
    //
    static void fun(){
        System.out.println(x);  // 90
    }
}
