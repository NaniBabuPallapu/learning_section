package company.com.oops.abstraction;
abstract class Vehicle{
    public abstract void start();
    public static void stop(){
        System.out.println("Vehicle Stopped ... ");
    }
}
class Car extends Vehicle {
    @Override
    public void start(){
        System.out.println("Car Started ... ");
    }
}
class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike Started ... ");
    }
}
public class AbstractClassExample {
    public static void main(String[] args){
        System.out.println("== Abstract Class Example ===");

        Vehicle vehicle;

        vehicle = new Car();
        vehicle.start();
        Vehicle.stop();

        vehicle = new Bike();
        vehicle.start();
        Vehicle.stop();
    }
}
