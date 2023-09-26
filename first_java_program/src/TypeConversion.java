import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println("Integer is converted to float automatically");
        System.out.println(num);
        // If  you input integer then it will automatically convert it into float

        //Type casting
        int num1 = (int)(65.23f);  // Returns only the integer value of the float
        System.out.println("Integer  Value of the Float ");
        System.out.println(num1);

        // Automatic type promotion in expressions
        //        int a = 257;
        //        byte b = (byte)(a); // 257 % 256 = 1


            //        System.out.println("Automatic type promotion");
            //        byte a  =40;
            //        byte b = 50;
            //        byte c = 100;
            //        int d = ( a * b ) / c;
            //        System.out.println(d);

        int number = 'a';
        System.out.println(number);
        // converts it into ASCII value  i.e it automatically converts the
        // number into ascii values


        // Moreover Java Follows Unicode
        //Eg:-
        System.out.println("नमस्ते");
        // Output will be same as it is


        byte x = 42;
        char c = 'a';
        short s = 234;
        int i = 5687;
        float f = 5.67f;
        double d = 0.21343;
        double result = ((f * x) + (i / c)) - (d - s);
        System.out.println((f * x) + " " + (i / c) + " " +  (d - s));
        System.out.println(result);

    }
}


