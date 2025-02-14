package Interfaces.DefaltMethod;

public interface StringManipulator {

    String add(String a, String b);

    String takeFirst(String s, int n);

    default String upper(String s){
        return s.toUpperCase();
    }
    /*
    O 'default' não obriga a criação desse metodo em todas as classes que são implementadas pela
    interface. Se o 'default' não fosse usado seria necessário criar, em todas as classes que utilizam
    a interface, a aplicação desse mesmo metodo.
     */

    static String lower(String s) {
        return s.toLowerCase();
    }
}
