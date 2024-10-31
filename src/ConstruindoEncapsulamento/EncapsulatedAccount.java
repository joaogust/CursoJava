package ConstruindoEncapsulamento;

// Java Top Level Class (uma classe por arquivo)
// Alt+insert || code > generate = abre o menu para criação de getters e setters
@SuppressWarnings("unused")
public class EncapsulatedAccount {
    private final String accountNumber; // Número da conta || Final quer dizer que o atributo só pode ser alterado 1 vez
    private final String accountOwner; // Proprietário da conta
    private double balance; // Saldo

    // Constructor principal
    public EncapsulatedAccount(String accountNumber, String accountOwner, double balance) {
        this.accountOwner = accountOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public EncapsulatedAccount(String accountNumber) {
        this(accountNumber, null, 0);
    }

    public EncapsulatedAccount(String accountNumber, double balance) {
        this(accountNumber, null, balance);
    }

    public EncapsulatedAccount(String accountNumber, String accountOwner) {
        this(accountNumber, accountOwner, 0);
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

    void transfer(double amount, EncapsulatedAccount targetAccount) {

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

}



