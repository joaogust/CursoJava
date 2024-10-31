package ModificadorStatic;

public class IdGeneratedAccount {
    public static final int INITIAL_VALUE = 10; // Constante
    /*
    Uma constante deve ser iniciada dentro da classe e com letras maiúsculas (convenção).
     */

    private final String accountNumber; // Número da conta || Final quer dizer que o atributo só pode ser alterado 1 vez
    private final String accountOwner; // Proprietário da conta
    private double balance; // Saldo

    private static int currentId; // O static compartilha a variável currentId entre todos os objetos dessa classe.
                                  // O static existe a nivel de classe e não de objeto.

    static { // Bloco static
        System.out.println("Inicializando bloco static");
        currentId = 1;
    }
    /*
    O bloco static é inicializado somente uma vez na primeira vez que voce acessa a classe.
    Se não for feito nenhum acesso à classe ele não vai inicializar.
     */

    public IdGeneratedAccount(String accountOwner) {
        this.accountNumber = "000" + currentId++;
        this.accountOwner = getAccountOwner();
        this.balance = 0.0;
    }

    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    boolean deposit(String amount) {
        return deposit(Double.parseDouble(amount));
    }

    boolean withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transferência realizada com sucesso!");
            return true;
        } else {
            System.out.println("Ops... não foi possível realizar a transferência.");
            return false;
        }
    }

    void transfer(double amount, IdGeneratedAccount targetAccount) {

        if(withdraw(amount)) {
            targetAccount.deposit(amount);
        }
    }

    void printBalance() {
        System.out.println("Balance: R$ " + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public static int getCurrentId() {
        return currentId;
    }
}



