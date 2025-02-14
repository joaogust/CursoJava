package Interfaces.Pet;

public class ExPet {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.setColor("Brown");
        cat.setColor("White");
        fish.setColor("Blue");

        System.out.println("A cor do cachorro é: " + dog.getColor());
        dog.talk();
        dog.walk();

        System.out.println("A cor do gato é: " + cat.getColor());
        cat.talk();
        cat.walk();

        System.out.println("A cor do peixe é: " + fish.getColor());
        fish.swim();
    }
}
