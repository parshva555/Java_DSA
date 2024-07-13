package AbstractDemo;


// You also cannot have a final abstract class as it cannot be inheritied
public abstract class Parent {
    // if a class will be having one or more abstract methods then the class also needs to
    // be abstract and abstract methods are those in which the methods are defined
    // in the parent class but the body will be defined in the child class
    // basically child class is overriding the function

    int age;
    public Parent(int age){
        this.age = age;
    }

// You cannot make abstract constructors
//    abstract Parent();

    // you also cannot make abstract static methods because they cannot be overriden
    // but you can make static methods in abstract classes
    static void hello (){
        System.out.println("Hey");
    }

    // you can have normal methods
    void normal(){
        System.out.println("This is a normal method");
    }

    abstract  void career();
    abstract void partner();
}
