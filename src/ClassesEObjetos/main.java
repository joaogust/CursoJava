package ClassesEObjetos;

//link das explicações do funcionamento na steck e no heap:
//https://www.udemy.com/course/java-360-curso-completo-do-zero-ao-avancado-com-projetos/learn/lecture/44909935#questions
//https://www.udemy.com/course/java-360-curso-completo-do-zero-ao-avancado-com-projetos/learn/lecture/44909907#questions
//https://www.udemy.com/course/java-360-curso-completo-do-zero-ao-avancado-com-projetos/learn/lecture/44909945#questions

@SuppressWarnings("unused")
public class main {
    public static void main(String[] args) {
        Account a = new Account();
        Account b = new Account();
        Account c = new Account();

        a.deposit("1000");
        b.deposit(100);

        a.transfer(450, b);

        System.out.println("Conta A");
        a.printBalance();
        System.out.println("\nConta B");
        b.printBalance();
        System.out.println("\nConta C");
        c.printBalance(); // Como não inicializei a variavel balance o java entende que ela vale 0, se fosse uma String seria null
    }
}
