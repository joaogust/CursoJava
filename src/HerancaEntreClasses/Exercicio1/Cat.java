package HerancaEntreClasses.Exercicio1;

public class Cat extends EarthPet {

    @Override
    public void walk() {
        System.out.println("O gato está andando.");
    }

    @Override
    public void talk() {
        System.out.println("O gato está miando.");
    }
}
