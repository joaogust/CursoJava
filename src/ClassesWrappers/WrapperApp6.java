package ClassesWrappers;

public class WrapperApp6 {

    public static void main(String[] args) {

        Person p1 = new Person(25, 60.0);
        System.out.println(p1);

        Person p2 = new Person(null, null);
        System.out.println(p2);
        /*
        Por serem objetos eu posso instanciar de forma null (nula)
        - Tipos primitivos não podem armazenar valores null.
         */

        Integer a = null;
        a = Integer.valueOf(10);
        System.out.println(p2.getAge() + 10);
        /*
        Isso geraria uma NullPoiterException, uma vez que a referência é nula.

        - o 'p2.getAge()' não é o problema
        - O problema acontece quando a IDE faz o AutoBoxing

        EX:
            int t = p2.intValue(); << daria problema aqui, está atribuindo um valor nulo a um tipo primitivo
            t += 10;
            p2 = Integer.valueOf(t);
         */


    }
}
