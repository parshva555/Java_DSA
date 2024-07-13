package Interfaces;

public class ElectricEngine implements Engine{
    public void start(){
        System.out.println("Electric Engine start");
    }
    public void stop(){
        System.out.println("Electric Engine stops");
    }
    public void accelerate(){
        System.out.println("Electric Engine accelerates");
    }
}
