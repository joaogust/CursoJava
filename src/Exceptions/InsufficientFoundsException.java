package Exceptions;

public class InsufficientFoundsException extends Exception{
    private final double currentBalance;

    public InsufficientFoundsException(double currentBalance) {
        super("There is no sufficient founds to withdraw.");
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }
}
