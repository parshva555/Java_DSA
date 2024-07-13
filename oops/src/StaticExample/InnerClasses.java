package StaticExample;

public class InnerClasses {
    // outside classes cannot be static i.e InnerClass cannot be static
    // Inner class can be static
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // this wont work as Test needs to be static as inside a static function, only other static functions works and not normal function

        Test a = new Test("Parshva");
        Test b = new Test("Nidhi");
        System.out.println(a.name);
        System.out.println(b.name);

        // but when we make the test class Static it will work
    }
}
// here also class A is outside class and cannot be static as it will give error
// static class  A{

// }
