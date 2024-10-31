package ConstruindoEncapsulamento;

public class App2Java {
    public static void main(String[] args) {
        final var account1 = new EncapsulatedAccount("1234", "João");
        final var account2 = new EncapsulatedAccount("4321", "João");
        /*
        O final na frente do objeto faz com que ele não possa apontar para outro, mas seus atributos ainda podem ser alterados.
        Ex: account1 = account2 não seria compilado, uma vez que a IDE reconheceria como erro, por conta do objeto ser 'final'.
         */

        account1.printBalance();
        account1.deposit(100);
        account1.printBalance();
    }

}
