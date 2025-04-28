package company.com.sample;

class Engine {
    private static int engineCount = 0;

    public Engine() {
        engineCount++;
    }

    public void start() {
        System.out.println("Engine Started...");
    }

    public static int getEngineCount() {
        return engineCount;
    }

    public static void setEngineCount(int engineCount) {
        Engine.engineCount = engineCount;
    }
}

class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car Started ...");
    }
}

class Bike {
    private final Engine engine;

    public Bike(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Bike Started...");
    }
}

public class DependencyExample {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.start();
        Bike bike = new Bike(engine);
        bike.start();
        System.out.println("Engine Created " + Engine.getEngineCount());
    }
}
