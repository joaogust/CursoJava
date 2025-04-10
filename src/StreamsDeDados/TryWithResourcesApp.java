package StreamsDeDados;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class TryWithResourcesApp {

    public static void main(String[] args) {

        Path path = Path.of("src", "StreamsDeDados", "out2.txt");
        File file = path.toFile();

//        FileWriter out = null;
//        try {
//            try  {
//                out = new FileWriter(file, StandardCharsets.UTF_8);
//                out.write("Something");
//            } finally {
//                if(out != null) {
//                    out.close();
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (FileWriter out = new FileWriter(file, StandardCharsets.UTF_8)) {
            out.write("Something");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        O close() é chamado automaticamente no try-with-resources.
        Tudo o que é colocado entre os parênteses após o try precisam ser objetos que implementam em algum nível a
        interface AutoCloseable.
        Todos que implementam o a interface AutoCloseable precisam utilizar o metodo close();

        Assim, com o try-with-resource o close() é chamado automaticamente mesmo na presença de uma excessão.
         */
    }
}
