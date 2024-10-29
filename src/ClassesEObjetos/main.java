package ClassesEObjetos;

@SuppressWarnings("unused")
public class main {
    public static void main(String[] args) {
        Account a = new Account();
        Account b = new Account();
        Account c = new Account();

        a.deposit("1000");
        b.deposit(100);

        a.transfer(450, b);

        System.out.println("Conta A");
        a.printBalance();
        System.out.println("\nConta B");
        b.printBalance();
        System.out.println("\nConta C");
        c.printBalance(); // Como não inicializei a variavel balance o java entende que ela vale 0, se fosse uma String seria null
    }
}
