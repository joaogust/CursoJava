package Interfaces.Pet;

public class app {

    public static void main(String[] args) {
        var dog = new Dog();
        dog.feed(10);
        System.out.println(dog.getAmountEaten());

        var cat = new Cat();
        cat.feed(3);
        cat.feed(9);
        System.out.println(cat.getAmountEaten());

//        var pet = new Pet();
//        pet.feed(3);
//        pet.feed(9);
//        System.out.println(pet.getAmountEaten());
    }
}
