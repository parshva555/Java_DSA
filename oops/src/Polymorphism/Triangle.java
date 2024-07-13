package Polymorphism;

public class Triangle extends Shapes{
    // this will run when the object of Triangle is created
    // hence it is overriding the parent method
    @Override //annotation
    void area(){
        System.out.println("Area is half into h * b");
    }
}
