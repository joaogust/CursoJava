package Revisão.Interface;

public class SameCredentialsLoginMethod implements LoginMethod {

    @Override
    public boolean login(String username, String password) {
        return username.equals(password);
    }
}