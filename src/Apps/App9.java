package Apps;

import TratandoExceptions.AccountService;
import TratandoExceptions.ServiceException;

public class App9 {
    public static void main(String[] args) {

        AccountService accountService = new AccountService();

        try {
            accountService.createAndWhithdraw("1234", 1400);

        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }
}
