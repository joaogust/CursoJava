package Interfaces.walk.Exercicio;

public class StaticLoginMethod implements LoginMethod {
    private static final String username = "joao";
    private static final String password = "1234";


    @Override
    public boolean loguin(String username, String password) {
        return username.equals(username) && password.equals(password);
    }

}
