package Polymorphism;

public class Shapes {
    void area(){
        System.out.println("I am in Shapes");
    }
    // Early binding  as it checking the final keyword at compile time only : check notes
//    final void area(){
//        System.out.println("I am in Shapes");
//    }

    // Static functions cannot be overriden
    // as overriding depends on objects
    // and static doesnt depends on objects
    // therefore, static cannot be overriden
    // tho, static can be inherited 

}
