package StaticExample;

// if files are in the same folder you wont have to import it

// static - u can use the main function without creating the object of the class
public class Main {
    public static void main(String[] args) {
        // static method can only access static data
        Human parshva = new Human(22,"Parshva",1000, false);
        Human Rahul = new Human(20,"Rahul", 2000, true);
        Human Nidhi = new Human(20,"Nidhi", 2000, true);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);
        // you wont be able to access the function here as it is non - static
        // you can access the function if we make it static
        //greeting();
        // to make greeting() run we will have to make a object
        Main obj = new Main();
        obj.greeting();
        greeting1();
    }

    // we know something that is not static belongs to an object
    // but if we make the the function greeting static, then we wont be needing objects
    // the function fun will not be dependent on objects as it is static
    // but greeting will be  dependent on objects as it is not static
    static void fun(){
        // greeting(); // you cant use this because it requires an instance
        // but the function that u are using in does not depend on instances
    }
    void greeting(){
        greeting1(); // you can have a static function inside a non static function
        System.out.println("Hello, I am greeting you");
    }
    void func2(){
        greeting();
    }
    static void greeting1(){
        System.out.println("Hello, I am greeting 1 and i am accessible in the main function");
    }
}
