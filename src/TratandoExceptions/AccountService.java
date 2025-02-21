package TratandoExceptions;

public class AccountService {

    public void createAndWhithdraw(String n, double ammont) throws ServiceException {

        Account1 account = new Account1(n);
        account.deposit(1000);

        try{
            account.withdraw(ammont);
        } catch (InsufficientFoundsException e) {
            throw new ServiceException("Error during withdraw.", e);
        }

        /* Nunca engula uma excessão, deixando o catch sem nenhum conteúdo
        EX:
            try{
                account.withdraw(ammont);
            } catch (InsufficientFoundsException e) {

            }
        */
    }
}
