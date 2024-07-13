package Interfaces;

public class Car implements Engine, Brake, Media {
    // Multiple inheritence using interface
    @Override
    public void breaker() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car");
    }
}
