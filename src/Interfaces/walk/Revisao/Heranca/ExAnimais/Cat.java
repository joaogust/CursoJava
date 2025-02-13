package Interfaces.walk.Revisao.Heranca.ExAnimais;

public class Cat extends Terrestres{

    @Override
    public void andar() {
        System.out.println("O gato está andando");
    }

    @Override
    public void falar() {
        System.out.println("miau");
    }
}
