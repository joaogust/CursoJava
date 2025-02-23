package ClassesWrappers;

/*
    - As classes wrapper são utilizados, na maioria das vezes, em cenários onde utilizar
    tipos primitivos não é possível.
    As vezes você quer passar um valor inteiro em um metodo que só recebe objetos.
    - Tipos primitivos armazenam valores, já os Wrapper's armazenam referências

    - Depois que um valor é armazenado nessa classe ele não pode ser alterado.
 */
public class WrapperApp1 {

    public static void main(String[] args) {

        int i = 10;
        Integer x = Integer.valueOf(i);

        System.out.println(x);

        int j = x.intValue();
//        int j = x.doubleValue();
//        int j = x.floatValue();

        System.out.println(j);

        /*
        Não é correto instanciar uma Wrapper Class como uma classe comum:
            Integer x = new Integer(10);

        - O valueOf() utiliza um mecanismo semelhante ao Pool de Strings, onde as
        variáveis com o mesmo valor apontam para o mesmo objeto, ocupando menos espaço na memória.
         */

        Double d = Double.valueOf(8.3);
        System.out.println(d);


    }
}
