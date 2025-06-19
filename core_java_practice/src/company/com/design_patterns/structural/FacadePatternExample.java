package company.com.design_patterns.structural;

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Radio {
    void turnOn() {
        System.out.println("Radio turned on");
    }
}

class AirConditioning {
    void turnOn() {
        System.out.println("Air conditioning turned on");
    }
}

class CarFacade {
    private Engine engine;
    private Radio radio;
    private AirConditioning ac;

    CarFacade() {
        engine = new Engine();
        radio = new Radio();
        ac = new AirConditioning();
    }

    void startCar() {
        engine.start();
        radio.turnOn();
        ac.turnOn();
    }
}

public class FacadePatternExample {
    public static void main(String[] args) {
        CarFacade car = new CarFacade();
        car.startCar();
    }
}
