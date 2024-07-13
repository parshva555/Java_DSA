package Inheritence;

public class BoxPrice extends BoxWeight{
    double price ;
    public BoxPrice(){
        super();
        price = -1;
    }
    public BoxPrice(double price){
        this.price = price;
    }
    public BoxPrice(double l, double w, double h, double weight, double price){
        super(l,w,h,weight);
        this.price = price;
    }
}
