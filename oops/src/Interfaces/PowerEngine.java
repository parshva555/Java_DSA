package Interfaces;

public class PowerEngine implements Engine{
    public void start(){
        System.out.println("Power Engine start");
    }
    public void stop(){
        System.out.println("Power Engine stops");
    }
    public void accelerate(){
        System.out.println("Power Engine accelerates");
    }

}
