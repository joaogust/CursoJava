package ExpressõesRegulares.Exercícios;


public class Remover {

    public static void main(String[] args) {
        String text = "j1oa3o g78us1t31avo3";

        System.out.println(removeNumeros(text));
        System.out.println(removeNaoNumeros(text));

    }

    public static String removeNumeros(String text) {
//        String text2 = text.replaceAll("\\d", "");
        String text2 = text.replaceAll("[0-9]", "");

        return text2;
    }

    public static String removeNaoNumeros(String text) {
//        String text2 = text.replaceAll("[^0-9]", ""); // '^' é como se fosse um '!'
        String text2 = text.replaceAll("\\D", ""); // a letra maiúscula também faz vira um '!'

        return text2;
    }

}
