package Interfaces.walk.Revisao.Heranca.ExAnimais;

public class main {
    public static void main(String[] args) {
        var gato = new Cat();
        gato.setColor("Preto");
        gato.andar();
        gato.falar();
        System.out.println(gato.getColor());

        System.out.println("------------------");

        var cachorro = new Dog();
        cachorro.setColor("Caramelo");
        cachorro.andar();
        cachorro.falar();
        System.out.println(cachorro.getColor());

        System.out.println("------------------");

        var peixe = new Fish();
        peixe.setColor("Azul");
        peixe.nadar();
        System.out.println(peixe.getColor());
    }
}
