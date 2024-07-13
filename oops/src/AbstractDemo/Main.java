package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        Daughter daughter = new Daughter(29);
        daughter.career();

        son.normal();
        // You cant create objects of a abstract class
//        Parent mom = new Parent(); This will give an error

        Parent.hello();
    }
}
