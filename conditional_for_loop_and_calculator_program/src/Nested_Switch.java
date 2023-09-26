import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Search for Employee!!");
        int empId = in.nextInt();
        String Department = in.next();
        switch (empId) {
            case 1 -> System.out.println("Parhva Dani");
            case 2 -> System.out.println("Nidhi Jagnani");
            case 3 -> {
                System.out.println("Employee Number 3");
                switch (Department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Managemennt Department");
                        break;
                    default:
                        System.out.println("No Department");
                }
            }
            default -> System.out.println("Hello Welcome to the New Company");
        }
    }
}
