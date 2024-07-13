package Inheritence;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(double l , double h, double w, double weight){
        // you wont be able to access private data members
        super(l,w,h); // what is this ? call the parent class constructor
        // used to initialize values present in parent class
        this.weight = weight;


        // more  about super keyword
        // you can directly access the member of parent class using super keyword
        System.out.println(super.w);

    }
}
