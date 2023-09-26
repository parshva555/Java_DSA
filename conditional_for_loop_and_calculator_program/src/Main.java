// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* Syntax of if statement
        If (boolean condition true or false)
        do this
        Else
        Do this*/

        int salary=55534;
        if (salary < 35000){
            salary += 2000;
        }
        else if (salary > 35000 && salary < 45000){
            salary+=23894;
        }
        else{
            salary+=1000;
        }
        System.out.println("The salary is:" + salary);
    }
}