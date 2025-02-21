package Strings;

public class StringApp3 {
    public static void main(String[] args) {
        // ------------- Aula 160 ------------- //

//        String s = "";
//        for(char c = 'A'; c <= 'Z'; c++) {
//            s += c;
//        }
//        System.out.println(s);

        StringBuilder s = new StringBuilder();
        for(char c = 'A'; c <= 'Z'; c++) {
            s.append(c);
        }

        System.out.println(s);

        String s2 = s.toString();
        System.out.println();
        System.out.println(s2);
    }
}
/*
    Utilizando o StringBuilder, espaços de memória são economizados e não acumulados como na 'img_2'.

    Para concatenação dentro de loops, o StringBuilder deve ser utilizado.
 */