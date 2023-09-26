public class Function_Overloading {
    public static void main(String[] args) {
//        fun(19);
        fun("Parshva Dani");
        int sum_of_3 = sum(2,3,4);
        int sum_of_2 = sum(34,2345);
        System.out.println(sum_of_2 + " and "+ sum_of_3);
        // If u dont give parameters to anty of them then it will show error and its called ambiguity
        // eg
        //  sum();
    }

    //The Parameters should be different
    // It runs at compile time
    // Either the number of arguments should be different or the type of arguments shoulf be different
    static void fun(int age){
        System.out.println("First One");
        System.out.println("My Age is "+age);
    }
    static void fun(String name){
        System.out.println("Second One");
        System.out.println("My Name is "+name);
    }

    static int sum(int a , int b){
        return a + b;
    }
    static int sum(int a , int b, int c){
        return a + b + c;
    }
}
