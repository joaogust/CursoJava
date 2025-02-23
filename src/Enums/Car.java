package Enums;

public class Car {

    public enum Brand {
        FORD,
        FERRARI,
        BMW
    }

    private final Brand brand;

    public Car(Brand brand) {
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }
}
