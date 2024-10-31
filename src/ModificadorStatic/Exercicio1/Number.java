package ModificadorStatic.Exercicio1;
// Aula 87
@SuppressWarnings("unused")
public class Number {
    private int number;

    public static int qtd;

    public Number(int number){
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

    public static void main(String[] args) {
        var n1 = new Number(7);
        System.out.println(n1.getNumber());

        var n2 = new Number(3);
        System.out.println(n2.getNumber());

        var n3 = Number.add(n1,n2);
        System.out.println(n3.getNumber());

        System.out.println(Number.getQtd());
    }
}
