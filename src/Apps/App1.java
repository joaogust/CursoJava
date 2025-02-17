package Apps;

import Polimorfismo.Pet.*;

public class App1 {
    public static void main(String[] args) {

        Pet dog = new Dog();
        //dog.feed();

        Pet cat = new Cat();
        //cat.feed();

        feedPet(dog);
        feedPet(cat);
        feedPet(new Fish());
    }

    public static void feedPet(Pet pet){
        pet.feed();
    }
}
