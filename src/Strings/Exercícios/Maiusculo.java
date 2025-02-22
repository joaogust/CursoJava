package Strings.Exercícios;

public class Maiusculo {

    public static void main(String[] args) {

        String s = upperCase("Java é muito legal!", "legal");
        System.out.println(s);


    }

    private static String upperCase(String s, String parte) {

        int pos = s.indexOf(parte);

        if(pos < 0) {
            return s;
        }
        String nova = s.substring(pos, pos + parte.length());
        String novaM = nova.toUpperCase();

        System.out.println(novaM);

        return s.substring(0, pos) + novaM + s.substring(pos + novaM.length(), s.length());
    }
}
