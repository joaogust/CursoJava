package Interfaces.Pet;

public class Dog  extends EarthPet {

    @Override
    public void walk() {
        System.out.println("O cachorro está andando.");
    }

    @Override
    public void talk() {
        System.out.println("O cachorro está latindo.");
    }

    @Override
    public void sleep(int time) {
        System.out.println("O cachorro dormiu por " + time + " horas.");
    }
}
