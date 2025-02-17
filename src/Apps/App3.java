package Apps;

import Polimorfismo.Pet.*;

public class App3 {
    public static void main(String[] args) {

        // Casting explícito aula 127

        Pet p = new Dog();
        /*
        Se dentro de Dog eu tenho um metodo que não existe em Pet, quando eu instancio um Pet para um Dog
        eu não posso utilizar esse metodo, haja vista que Pet não tem acesso.
        Quando eu faço isso "Pet p = new Dog();" basicamente eu acesso os métodos criados em Pet mas com
        a alteração de Dog.
         */
        p.feed();
        //p.sit();
        /*
        ele não pode compilar, por conta que esse metodo não vem de Pet, mas sim de Dog.
         */

        //Fish f = (Fish) p;
        //f.feed();
        /*
        Isso vai dar o erro "ClassCastException". Isso acontece porque o Fish está tentando
        fazer um casting não de Pet, mas sim de Dog. Isso é incorreto, uma vez que eles não
        são compatíveis na hierarquia.
         */

        if( p instanceof Dog) {
            Dog d = (Dog) p;
            d.sit();
        } else {
            System.out.println("O pet não é um dog.");
        }
        /*
        O "instanceof" faz a pergunta: o objeto apontado por 'p' no heap é do tipo Dog? se
        sim ele faz o casting explícito.
        Isso traz segurança.
         */


        p = new Fish();

        Dog d = new Dog();
        if(Pet.castingDog(p, d)) {
            d = (Dog) p;
            d.sit();
        } else {
            System.out.println("O pet não é um dog.");
        }

    }
}
