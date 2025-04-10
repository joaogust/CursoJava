package StreamsDeDados;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReadWriterApp {

    public static void main(String[] args) throws IOException {

        try (FileWriter out = new FileWriter("src/StreamsDeDados/out1.txt", StandardCharsets.UTF_8 /*Charset.forName("UTF-8")*/)) {
            // Charset -> codificação do arquivo
            out.write("Hello");
        }

        /*
        Ele pede para que chame o out.close() todas as operações de I/O basicamente precisam abrir um canal de comunicação ou
        com a entrada ou com a saída e esse canal tem que ser fechado com o out.close().
        O try-with-resources já faz isso automaticamente.
         */
    }
}
