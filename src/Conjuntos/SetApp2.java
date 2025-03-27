package Conjuntos;

import java.util.HashSet;
import java.util.Set;

public class SetApp2 {

    public static void main(String[] args) {
        Account a1 = new Account("123", 100);
        Account a2 = new Account("456", 200);
        Account a3 = new Account("456", 200);

        var accounts = Set.of(a1, a2, a3); // Set.of() cria sets imutáveis.

        for (Account account: accounts) {
            System.out.println(account);
        }
        /*
        Se sets não podem ter elementos repetidos como o a3 foi acrescentado no conjunto?

        O Java verifica igualdade utilizando 2 métodos, o equals e o hashcode.

        * Equals
            O equals é um metodo da classe Object que compara o endereço de memória, se os objetos são os mesmos!
            Como o a2 e a3 são objetos diferentes ele não reconheceu igualdade pelo equals.

        * HashCode
            Hash significa espalhamento, e esse metodo está muito ligado ao equals, quando você coloca um tem que
            colocar o outro. Os mesmos atributos para verificar igualdade no equals devem ser usados na geração do
            hashCode, para o retorno de um valor inteiro.
            Seu objetivo é gerar números diferentes para objetos que são diferentes.
             - Podem ter casos de gerar números iguais para objetos que são diferentes.
             - Não podem gerar números diferentes para objetos que são iguais.
            É basicamente um identificador inteiro de um objeto.
         */

        System.out.println();

        a3 = a2;

        var accounts2 = new HashSet<Account>();
        accounts2.add(a1);
        accounts2.add(a2);
        accounts2.add(a3); // Aponta para o mesmo objeto de a2, portanto são o mesmo objeto e não é adicionado no set.

        for (Account account: accounts2) {
            System.out.println(account);
        }

        System.out.println();

        Account2 a4 = new Account2("123", 100);
        Account2 a5 = new Account2("456", 200);
        Account2 a6 = new Account2("456", 200);

        var accounts3 = new HashSet<Account2>();
        accounts3.add(a4);
        accounts3.add(a5);
        accounts3.add(a6);

        for (Account2 account: accounts3) {
            System.out.println(account);
        }
        /*
        Mesmo a5 e a6 não apontando para o mesmo objeto a Account2 tem os metodos equals e hashCode sobrescritos
        e agora não veem somente se são o mesmo objeto mas também se contém os mesmos dados.
         */
    }
}
