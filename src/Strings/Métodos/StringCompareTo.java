package Strings.Métodos;

public class StringCompareTo {

    public static void main(String[] args) {
        // Ordem alfabética

        String s1 = "bed";
        String s2 = "chair";

        int r = s1.compareTo(s2);
        System.out.println(r);

        r = s2.compareTo(s1);
        System.out.println(r);

        s2 = s1;
        r = s1.compareTo(s2);
        System.out.println(r);
    }
}
