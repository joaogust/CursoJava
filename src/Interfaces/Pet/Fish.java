package Interfaces.Pet;

public class Fish extends WaterPet {

    @Override
    public void swim() {
        System.out.println("O peixe está nadando.");
    }

    @Override
    public void sleep(int time) {
        System.out.println("O peixe dormiu por " + time + " horas.");
    }
}
