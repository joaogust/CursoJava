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

    @Override
    public void sleep(int time) {
        System.out.println("O gato dormiu por " + time + " horas.");
    }
}
