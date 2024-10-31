package Pacotes;

// importando duas classes com mesmo nome em pacotes diferentes

// Eu só posso importar uma das classes, uma vez que o Java não saberia qual classe deveria ser instanciada.

import ClassesEObjetos.Account;
// import ModificadorStatic.Account;

public class App6Java {
    public static void main(String[] args) {
        Account a = new Account();
        ModificadorStatic.Account b = new ModificadorStatic.Account();
    }
}
