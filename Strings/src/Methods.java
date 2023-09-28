import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Parshva Dani";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf("D"));
        System.out.println("       Parshva      ".strip()); // extra spaces are removed
        System.out.println(Arrays.toString(name.split(" " )));
    }
}
