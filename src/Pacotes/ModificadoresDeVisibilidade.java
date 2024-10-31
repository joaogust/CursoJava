package Pacotes;

import ClassesEObjetos.Account;

public class ModificadoresDeVisibilidade {
    /*
    public: permite o acesso de qualquer parte do código.

    protected:
    1. Permite o acesso de classes dentro do mesmo pacote.
    2. Permite o acesso entre heranças de pacotes diferentes.

    default (ou package-private): é o modificador de visibilidade padrão em Java, que é aplicado quando não há um modificador explícito. Esse acesso permite que classes, métodos, ou variáveis sejam acessados apenas por outras classes no mesmo pacote. Classes fora do pacote não conseguem acessar esses membros.

    private: é o modificador mais restritivo. Ele limita o acesso apenas à própria classe onde o membro foi declarado. Nem subclasses nem classes do mesmo pacote têm acesso a membros privados, sendo usado geralmente para encapsular dados que não devem ser expostos.
     */

    public int a;
    protected int b;
    int c;
    private int d;

    public static void main(String[] args) {
        Account e = new Account();

        // System.out.println(e.accountNumber);
    }
}
