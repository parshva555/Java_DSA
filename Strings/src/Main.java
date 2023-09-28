// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String a = "Parshva";
        String b = "Parshva";
        // In this both the variables are pointing tot hte same object. therefore it will true
//        System.out.println(a==b);

        String name1 = new String("Parshva");
        String name2 = new String("Parshva");
        // here the both variables have different objects therefore it will give false
//        System.out.println(name1==name2); // this is a comparator
        System.out.println(name1.equals(name2)); // this is a method which will only check the values . It will give true
        System.out.println(name1.charAt(0));
    }
}