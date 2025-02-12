package Interfaces.walk.Exercicio;

public class SameCredentialsLoginMethod implements LoginMethod{

    public boolean loguin(String username, String password){
        return username.equals(password);
    }
}
