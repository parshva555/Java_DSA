import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
//        System.out.println("Please Enter the Fruit:");
//        String fruit = in.next();
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of Fruits");
//            case "Apple" -> System.out.println("A sweet Red fruit");
//            case "Orange" -> System.out.println("Round Fruit");
//            case "Grapes" -> System.out.println("Samll Fruit");
//            default -> System.out.println("Please Enter a Valid Fruit");
//        }


        //Another Shortcut for Switch case with Similar Cases for Many conditions

        int day = in.nextInt();
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
