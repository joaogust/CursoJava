package ModificadorStatic;

public class App3Java {
    public static void main(String[] args) {
        var a = new IdGeneratedAccount("Joao");
        var b = new IdGeneratedAccount("Ana");

        System.out.println(a.getAccountNumber());
        System.out.println(b.getAccountNumber());

        System.out.println(IdGeneratedAccount.getCurrentId());
        /*
        Para chamar o getCurrentId() não é correto que eu use uma instância,
        uma vez que se trata de um metodo static. Assim, devo chamá-lo usando
        sua própria classe: 'IdGeneratedAccount.getCurrentId()'.
         */


    }
}
