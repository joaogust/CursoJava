package Interfaces.Pet;

public class Cat extends EarthPet {

    @Override
    public void walk() {
        System.out.println("O gato está andando.");
    }

    @Override
    public void talk() {
        System.out.println("O gato está miando.");
    }
}
