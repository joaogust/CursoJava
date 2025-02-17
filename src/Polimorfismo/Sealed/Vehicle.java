package Polimorfismo.Sealed;

public abstract sealed class Vehicle permits Car, Bus {

    public abstract void drive();
}
