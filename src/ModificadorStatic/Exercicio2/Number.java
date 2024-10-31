package ModificadorStatic.Exercicio2;
// Aula 88
public class Number {
    private int number;

    public static int qtd;

    private Number(int number){
        this.number = number;
        qtd += 1;
    }

    void increment() {
        number += 1;
        System.out.println("n = " + number);
    }

    public static Number add(Number n1, Number n2) {

        return new Number(n1.getNumber() + n2.getNumber());
    }

    static int getQtd() {
        return qtd;
    }

    public int getNumber() {
        return number;
    }

    public static Number newNumber(int n){
        return new Number(n);
    }
}
