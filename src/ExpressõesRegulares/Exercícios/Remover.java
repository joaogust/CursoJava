package ExpressõesRegulares.Exercícios;


public class Remover {

    public static void main(String[] args) {
        String text = "j1o2a3o4";


        System.out.println(removeNum(text));
        System.out.println(removeNaoNum(text));
    }

    public static String removeNum(String s) {
        return s.replaceAll("[0-9]", "");
    }

    public static String removeNaoNum(String s) {
        return s.replaceAll("[^0-9]", "");
    }
}
