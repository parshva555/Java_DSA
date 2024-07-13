package Polymorphism;


// Polymorphism - 2 types
// 1) Compile Time/ Static - method overloading
// 2) Run Time / Dynamic - method overriding
public class Main {
    public static void main(String[] args) {
//        Shapes shape = new Shapes();
//        Circle circle = new Circle();
//        Square square = new Square();
//        shape.area();
//        circle.area();
//        square.area();


        // Parent obj = new Child();
        // Here, which method will be called depends on Child()
        // this is known as upcasting
        // and this whole thing overall is called overriding
        // Eg -
        Shapes obj = new Circle();
        obj.area();
        // This will give area of circle and not the output of the area function of shapes

        // This is done using dynamic method dispatching
        // defined as - it is a mechanism in which a call to the overridden method is resolved
        // at runtime rather than compile time


    }
}
