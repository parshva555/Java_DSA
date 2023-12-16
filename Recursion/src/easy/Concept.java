package easy;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        fun(--n); // this works ... first decrement and then pass the value
//      fun(n--); // this does not... first pass value then decrement
//        n-- vs --n
    }


}
