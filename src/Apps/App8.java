package Apps;

import Exceptions.Account2;
import Exceptions.Account3;
import Exceptions.Account4;

/*
    O texto vermelho quanto aparece um erro é chamado de stack trace (rastreio de pilha).
    Stack, porque quando chamamos metodos, fazemos um empilhamento em camadas.
        - Quando entramos em um novo metodo, basicamente nós empilhamos as informações dele
        em cima do metodo que estamos executando.

        - Quando termina você empilha esse metodo, sai dele e continua executando o metodo
        anterior da parte onde você parou. Funciona como uma pilha de pratos.

    A Stack Trace retorna a sequência do que estava acontecendo quando o problema aconteceu.
        - A primeira linha mostra a parte que deu erro e, em caso de excessões, o nome da excessão.
        - Ela começa de baixo para cima, sendo a última linha o primeiro metodo que estava sendo executado.
    EX:
        Exception in thread "main" java.lang.RuntimeException: Ammount cannot be negative.
            at UsandoExceptionsParaComunicarFalhas.Account2.withdraw(Account2.java:29)
            at Apps.App8.main(App8.java:15)

        Process finished with exit code 1

    O "Process finished with exit code 1" significa que o processo foi finalizado com o erro 1. Se foi
    finalizado com sucesso ele terminaria com o 0.
 */
public class App8 {
    public static void main(String[] args) throws Exception {

        // ---------- AULA 139 ----------//

        Account2 a = new Account2("007");

        a.deposit(1000);
        System.out.println(a);

        System.out.println("--------------------------");

//        a.withdraw(-400); // Apresenta o uma chamada de erro
//        a.withdraw(1500); // Apresenta o uma chamada de erro
        a.withdraw(400);
        System.out.println("Success!");
        System.out.println(a);

        System.out.println("--------------------------\n");

        // ---------- AULA 141 ----------//

        Account3 b = new Account3("008");
        b.deposit(100);
        System.out.println(b);
        b.withdraw(50); // necessário colocar o throws Exception na frente do main

        System.out.println("--------------------------\n");

        // ---------- AULA 143 ----------//

        Account4 c = new Account4("009");
        c.deposit(500);
        System.out.println(c);
        c.withdraw(600);


    }
}
