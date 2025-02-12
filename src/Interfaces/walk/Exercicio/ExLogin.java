package Interfaces.walk.Exercicio;

public class ExLogin {
    public static void main(String[] args) {
        StaticLoginMethod l1 = new StaticLoginMethod();

        System.out.println(l1.loguin("joao", "123"));

        SameCredentialsLoginMethod l2 = new SameCredentialsLoginMethod();
        System.out.println(l2.loguin("Jao", "Jao"));

    }
}
