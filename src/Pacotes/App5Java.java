package Pacotes;

import ConstruindoEncapsulamento.EncapsulatedAccount;
import ClassesEObjetos.*;

/*
Como a classe está em outro pacote, para acessá-la é necessário
que eu a referencie, seja com import ou na criação do objeto.

Se eu colocar o nome do pacote e em seguida o * todas as classes podem ser acessadas.

A IDE automaticamente importa a classe quando o objeto é instanciado.

ctrl+alt+o = organiza os imports em ordem alfabética e tira os que não estão sendo usados.
 */

/*
O pacote java.lang é o pacote Java que não precisa ser referenciado.
Ele é o responsável por disponibilizar algumas classes como o String e o System.
*/

@SuppressWarnings("unused")
public class App5Java {
    public static void main(String[] args) {
        // var account = new ClassesEObjetos.Account();
        Account account1 = new Account();
        Account account2 = new Account();
        EncapsulatedAccount account3 = new EncapsulatedAccount("1234");
    }
}
