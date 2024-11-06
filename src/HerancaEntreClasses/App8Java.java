package HerancaEntreClasses;

// Todas as classes herdam de Object, e por conta disso herdam seus métodos e é possível sobrescrevelos
public class App8Java extends Object{
    public static void main(String[] args) {
        var a = new Account("1234");
        a.setAccountOwner("João");
        a.setBalance(1000);
        System.out.println(a.toString());
    }
}
