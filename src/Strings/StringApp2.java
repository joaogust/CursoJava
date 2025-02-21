package Strings;

public class StringApp2 {
    public static void main(String[] args) {
        // ------------- Aula 157 ------------- //

        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = "ABC";
        String s4 = s1;
        String s5 = s2;
        String s6 = new String("ABC"); // fora do Pool
        String s7 = s6.intern(); /* Encontrou uma String fora do pool e passou seu conteúdo
        para uma String que está dentro, logo agora s7 contém o valor de uma String fora do pool dentro do pool.
       */

        printEquality(s1,s2);
        printEquality(s2,s3);
        printEquality(s3,s4);
        printEquality(s4,s5);
        printEquality(s5,s6);
        printEquality(s6,s7);
    }

    public static void printEquality(Object o1, Object o2) {
        System.out.println();
        System.out.println(o1 + " == " + o2 + " --> " + (o1 == o2));
        System.out.println(o1 + " equals(" + o2 + ") --> " + (o1.equals(o2)));
    }
}
