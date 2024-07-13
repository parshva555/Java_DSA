package Singleton;

public class main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2= Singleton.getInstance();
        // all 3 ref variables are pointing to just one object
    }
}
