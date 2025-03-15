package Revisão.Interface;

public class ExLogin {

    public static void main(String[] args) {

        var l1 = new SameCredentialsLoginMethod();

        System.out.println(l1.login("Joao", "Joao"));
        System.out.println(l1.login("admin", "123"));

        var l2 = new StaticLoginMethod();
        System.out.println(l2.login("Joao", "Joao"));
        System.out.println(l2.login("admin", "123"));
    }
}
