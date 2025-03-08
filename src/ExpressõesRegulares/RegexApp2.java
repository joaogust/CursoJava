package ExpressõesRegulares;

import java.util.regex.*;

public class RegexApp2 {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\w*\\s\\w*");
        Matcher m = p.matcher("abc def");

        System.out.println(m.matches());

        System.out.println("123".matches("\\d*"));

        System.out.println("12s3".matches("\\d*"));
    }
}
