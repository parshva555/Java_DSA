package Polymorphism;

public class Square extends Shapes{
    // this will run when the object of Square is created
    // hence it is overriding the parent method
    @Override //annotation
    void area(){
        System.out.println("Area is Square of side");
    }
}
