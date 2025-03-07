package ExpressõesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp1 {

    public static void main(String[] args) {

        printMatches("sgoj32jso2", "\\d");
        System.out.println();

        printMatches("sgoj320jso2", "\\d\\d\\d");
        System.out.println();

        printMatches("sdf342jafwe82njk1", "([a-z])+");
        System.out.println();

        printMatches("sdf342jafwe82njk1", "\\d([a-z])+");
        System.out.println();
    }

    public static void printMatches(String text, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.format("%d -> '%s'\n", m.start(), m.group());
        }
    }
}
