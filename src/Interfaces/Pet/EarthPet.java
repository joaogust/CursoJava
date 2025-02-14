package Interfaces.Pet;

public abstract class EarthPet extends Pet {
    public void walk() {
        System.out.println("O animal terrestre está andando.");
    }

    public void talk() {
        System.out.println("O animal terrestre está emanando som pela boca.");
    }
}
