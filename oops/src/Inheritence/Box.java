package Inheritence;

public class Box {
    double l;
    double h;
    double w;
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    Box (double side){
//        super(); // Object class
        this.w = side;
        this.l = side;
        this.h = side;
    }
    Box(double l, double w , double h){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
    public void information(){
        System.out.println("Running te box");
    }
}
