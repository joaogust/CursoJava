package Enums;

public class EnumApp3 {

    public static void main(String[] args) {

        Dog dog = new Dog();

        talk(dog);
        talk(MyPet.CAT);
        talk(MyPet.MOUSE);
    }

    public static void talk(Pet pet) {
        System.out.println(pet.talk());
    }
}
