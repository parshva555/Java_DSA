package StaticExample;

public class Human {
    int age;
    String name;
    int Salary;
    boolean Married;
    // those properties that are not directly related to the object are known as sstatic variables
    static int population;
    static void message(){
        System.out.println("Hello World");
        // System.out.println(this.age); // this keyword cannot be used in a static function as this is a object
        // from static u cannot use non-static stuff
    }
    public Human(int age , String name, int Salary, boolean Married){
        this.age = age;
        this.name = name;
        this.Salary = Salary;
        this.Married = Married;
        // to access the static variable u use the class name,you dont need to use the this keyword(you can use also)
        Human.population+=1;
    }

}
