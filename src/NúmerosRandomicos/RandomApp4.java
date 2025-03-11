package NúmerosRandomicos;

import java.util.UUID;

public class RandomApp4 {

    public static void main(String[] args) {

        UUID id = UUID.randomUUID();
        // Gera um indentificador único

        String s = id.toString();

        System.out.println(s);
    }
}
