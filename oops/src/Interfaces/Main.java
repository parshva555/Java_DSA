package Interfaces;
// Do not use interfaces in performance critical code
public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.accelerate();
//        car.breaker();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.start();
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.start();

    }
}
