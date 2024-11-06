package HerancaEntreClasses.Exercicio1;

public class Dog  extends EarthPet{

    @Override
    public void walk() {
        System.out.println("O cachorro está andando.");
    }

    @Override
    public void talk() {
        System.out.println("O cachorro está latindo.");
    }
}
