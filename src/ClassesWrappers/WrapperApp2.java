package ClassesWrappers;

public class WrapperApp2 {

    public static void main(String[] args) {
        Integer a = Integer.valueOf(56);
        Integer b = Integer.valueOf("56"); // converte String ->Integer
//        Integer c = Integer.valueOf("dfd"); // -> Daria um erro, pois não é possivel converter

        int c = Integer.parseInt("1234"); // converte String -> int

        Boolean d = Boolean.valueOf(true);
        Boolean e = Boolean.valueOf("true");
        boolean f = Boolean.parseBoolean("True");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}
