package ModificadorStatic.Exercicio2;

public class main {

    public static void main(String[] args) {
        var n1 = Number.newNumber(7);
        System.out.println(n1.getNumber());

        var n2 = Number.newNumber(3);
        System.out.println(n2.getNumber());

        var n3 = Number.add(n1,n2);
        System.out.println(n3.getNumber());

        System.out.println(Number.getQtd());
    }
}
