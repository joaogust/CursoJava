package ExpressõesRegulares;

import java.util.regex.*;

public class RegexApp3 {

    public static void main(String[] args) {

        String text = "a4bc4d75efg43h2";
        String regex = "\\d";
        String replacement = "*";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        StringBuilder sb = new StringBuilder();
        while (m.find()) {
            m.appendReplacement(sb, replacement);
        }
        m.appendTail(sb);

        System.out.println(sb);

        System.out.println("\n----------------------------\n");

        System.out.println(text.replaceAll(regex, replacement)); // trocou todos os números
        System.out.println(text.replaceFirst(regex, replacement)); // trocou o primeiro número encontrado


    }
}
