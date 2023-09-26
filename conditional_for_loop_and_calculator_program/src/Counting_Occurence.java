import java.util.Scanner;

public class Counting_Occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = input.nextInt();
        System.out.println("Enter Which Number you want the Occurence For:");
        int occ = input.nextInt();
        int counter = 0;
        while(n> 0){
            int rem = n%10;
            if(rem == occ)
            {
                counter++;
            }
            n = n / 10;
        }
        System.out.println("The Number Occured "+counter+" Times");
    }
}
