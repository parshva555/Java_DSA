import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        // You can only wrap it into wrapper class i.e Integer and not integer
        // it internally calls the toString Methofd
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(65);
        list.add(62345);
        list.add(6635);
        list.add(63245);
        list.add(61235);
        System.out.println(list.contains(6534534)); // return true or false
        System.out.println(list);

        list.set(0,99);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            list1.add(in.nextInt());
        }
        for (int i = 0; i <5 ; i++) {
            System.out.println(list1.get(i)); // pass index here , list[index] syntax will not work here
        }
        System.out.println(list1);
    }
}
