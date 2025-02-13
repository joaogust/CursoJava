package Interfaces.walk.Revisao.Heranca.ExAnimais;

public class Dog extends Terrestres{

    @Override
    public void andar() {
        System.out.println("O cachorro está andando");
    }

    @Override
    public void falar() {
        System.out.println("Au-au");
    }
}
