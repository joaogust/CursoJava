package Polimorfismo.Pet;

public abstract class Pet {

    abstract public void feed();

    public static boolean castingDog(Pet p, Dog a) {
        if(p instanceof Dog) {
            return true;
        }
        return false;
    }
    public static boolean castingFish(Pet p, Fish a) {
        if(p instanceof Fish) {
            return true;
        }
        return false;
    }
    public static boolean castingCat(Pet p, Cat a) {
        if(p instanceof Cat) {
            return true;
        }
        return false;
    }
}
