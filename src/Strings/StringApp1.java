package Strings;

public class StringApp1 {
    public static void main(String[] args) {
        // ------------- Aula 157 ------------- //
        String s1 = "A";
        String s2 = "B";
        String s3 = "B"; // está dentro do pool
        String s4 = new String("B"); // está fora da Pool

        /*
        Quando eu instancio uma String de uma forma direta (String a = "x"), ela fica dentro da Pool de Strings.
        A pool funciona como na imagem 2, se duas Strings tem o mesmo conteúdo elas apontam para o mesmo lugar, se uma
        String muda de valor esse outro valor é adicionado na pool e ela, a partir daí, aponta para esse outro valor.

        Quando eu instancio uma String de uma forma indireta (String s4 = new String("B")), ela fica fora da Pool,
        dessa forma ela nunca ira apontar para os objetos dentro da pool. Quando se compara um objeto dentro da Pool
        com outro de fora ele nunca vai dar true, mesmo contendo os mesmos valores, uma vez que o operador "=="
        compara objetos, endereços de memória, a localização do objeto dentro do heap. Se eu comparar duas Strings
        que apontam para o mesmo valor dentro do Pool a comparação vai dar true, uma vez que apontam para o mesmo endereço.

        Por conta disso, a comparação de Strings deve ser realizada pelo equals, que compara o conteúdo dentro da String
        e não a localização dos objetos dentro do heap.
         */

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);

        System.out.println("----");

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
