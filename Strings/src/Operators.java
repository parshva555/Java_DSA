import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // converts into ascii value
        System.out.println("a" + "b"); // here it take string values
        System.out.println((char)('a' + 3));
        System.out.println("a" + 3); // when integer is added to a string it is converted into its wrapper class
        // same as "a" + "3"
        // integer will be converted to Integer that will call .toString
        System.out.println("Parshva" + new ArrayList<>());
        System.out.println("Parshva" + new ArrayList<>());
//       System.out.println(new ArrayList<>() + new ArrayList<>()); Wont work coz the + is only made for primitives
        // and also for complex objects but only at one condition that one of the objects should gbe of type string.

    }
}
