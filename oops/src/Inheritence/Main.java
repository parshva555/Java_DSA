package Inheritence;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        Box box1 = new Box(2);
//        Box box2 = new  Box(2,5,6);
//        Box box3 = new Box (box2);
//        System.out.println(box.l + " " + box.h + " " + box.w);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);
//        System.out.println(box3.l + " " + box3.h + " " + box3.w);

//        Box box5 = new BoxWeight(2,3,4,5);


        // it is the type of reference variable i.e Box here that determines
        //. what members can be accessed and not the object (i.e BoxWeight)
        // here weight wont be accesible as the class is box(reference) and the object
        // that is being made is boxWeight
//        System.out.println(box5.weight);


         // You cant referemce a  child to parent
        // here the object is of type parent class so how will you call the constructor of child class
        // so this is not possible
//        BoxWeight box6 = new Box(2,3,4,5);


//        BoxWeight box4 = new BoxWeight();
//        System.out.println(box4.h + " " + box4.weight);
//
//
//        BoxWeight box5 = new BoxWeight(2,3,4,5);
//        System.out.println(box5.h + " " + box5.weight);
        BoxPrice box1 = new BoxPrice();
        System.out.println(box1.h);
        BoxPrice box = new BoxPrice(1,3,4,5,6);
        System.out.println(box.price);

    }
}
