import com.sun.security.jgss.GSSUtil;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b  = 20;
        String name = "Parshva";
        // System.out.println(marks); You cannot print the marks here. Marks can only be accesed
        // in the function code where it is defined

        //Block Scope
        {
            name = "rahul";
            a = 54;
            int c = 3542;
            System.out.println(c);  // This c can be only be accessed here and not outside the block
            //values initialized in the block will remain in the block and cannot be used outside the block
            System.out.println(name);
        }
        // The below statement will give an error
//        System.out.println(c);  Above the c is initialized in a specific block so it can be
        // only accessible in that block only
        random(485647);


        // Scoping in for Loop
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 9;
            int r = 90;
        }
//        System.out.println(r);  You cannot use r outside the for loop  nor num


        // anything initialized outside the block can be used inside the block
        // anything initialized inside the block cannot be used outside the block
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
