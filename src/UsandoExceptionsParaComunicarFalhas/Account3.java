package UsandoExceptionsParaComunicarFalhas;

    /*
    Enquanto o throw lança e termina o metodo com um comportamento excepcional o throws Exception vai na assinatura
    do metodo e diz que ele pode lançar exceções (não obrigatóriamente).
     */

public class Account3 {

    private final String number;
    private double balance;

    public Account3(String number) {
        this.number = number;
    }

    public boolean deposit(double ammount) {
        if(ammount > 0) {
            balance += ammount;
            return true;
        }
        return false;
    }

    public void withdraw(double ammount) throws Exception {

        if(ammount <= 0) {
            throw new Exception("Ammount cannot be negative.");
        }
        if(balance < ammount) {
            throw new Exception("Insufficient founds.");
        }
        balance -= ammount;
    }

    @Override
    public String toString() {
        return "Account3{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

}