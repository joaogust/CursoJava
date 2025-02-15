package Interfaces.Pet;

public abstract class WaterPet extends Pet {

    public void swim() {
        System.out.println("O animal aquático está nadando.");
    }

    @Override
    public void sleep(int time) {
        System.out.println("O animal aquático dormiu por " + " horas.");
    }
}
