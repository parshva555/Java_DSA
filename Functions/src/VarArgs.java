import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // It will internally store it into an array
        fun(2,4,6,7,8,9,0,5,3,5,6,7);
        fun2("parshva","dani","Hitesh","Dani");
        multiple(2,3,"Kunal","Rahul","Rohan");
    }
    static void multiple(int a , int b, String...k){
        // Body
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun2(String...s){
        System.out.println(Arrays.toString(s));
    }
}
