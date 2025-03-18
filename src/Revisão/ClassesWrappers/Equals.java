package Revisão.ClassesWrappers;

public class Equals {

    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 10;
        Integer c = new Integer(10);
        Integer d = 20;
        Integer e = 1000;
        Integer f = 1000;

        System.out.println(a == b); /*
        O Java utiliza um Integer Cache para otimizar o uso de memória e o desempenho ao trabalhar com objetos Integer.
        Esse cache armazena previamente instâncias de Integer para valores no intervalo de -128 a 127.

        Quando um número dentro desse intervalo é atribuído a uma variável Integer usando autoboxing (Integer x = 50;),
        o Java não cria um novo objeto, mas reaproveita uma instância existente do cache. Isso faz com que diferentes
        variáveis que armazenam o mesmo valor dentro desse intervalo apontem para o mesmo local na memória, resultando
        em comparações com == retornando true.

        Fora desse intervalo, o Java cria novos objetos Integer separadamente, então mesmo que dois Integer tenham o
        mesmo valor, eles não compartilharão a mesma referência de memória, tornando == falso.

        Esse mecanismo funciona de forma semelhante ao String Pool, onde strings literais idênticas também podem
        compartilhar a mesma instância para otimizar o uso de memória.
        */
        System.out.println(a.equals(b));
        System.out.println(a == c);
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(d));
        System.out.println(d.compareTo(a));
        System.out.println(e == f);

        /*
        == >> compara o endereço de memória
        equals() >> compara o conteúdo
        compareTo() >> compara o conteúdo e retorna 0 se for igual, 1 se a > b, -1 se a < b
         */
    }
}
