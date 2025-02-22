package Strings.Métodos;

public class StringReplace {

    public static void main(String[] args) {

        String str = "Java is the greatest language!";

        String strReplaced = str.replace("language", "programming language");

        System.out.println(strReplaced);

        strReplaced = str.replace("abc", "programming language"); // não encontrou "abc"

        System.out.println(strReplaced);
    }
}
