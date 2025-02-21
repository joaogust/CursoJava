package TratandoExceptions;

public class AccountService {

    public void createAndWhithdraw(String n, double ammont) throws ServiceException {

        Account1 account = new Account1(n);
        account.deposit(1000);

        try{
            account.withdraw(ammont);
        } catch (InsufficientFoundsException e) {
            throw new ServiceException(e.getMessage());
        }
    }
}
