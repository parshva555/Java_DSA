package Polymorphism;

public class Circle extends  Shapes{
    // this will run when the object of Circle is created
    // hence it is overriding the parent method
    @Override //annotation
    void area(){
        System.out.println("Area is p*r*r");
    }
}
