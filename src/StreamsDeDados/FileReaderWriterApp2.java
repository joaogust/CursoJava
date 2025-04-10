package StreamsDeDados;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderWriterApp2 {

    public static void main(String[] args) throws IOException {

        try (FileWriter out = new FileWriter("src/StreamsDeDados/out4.txt", StandardCharsets.UTF_8)) {
            IOOperations.write(out, "Hello! I'm learning Java");
        }

        try (FileReader in = new FileReader("src/StreamsDeDados/out4.txt", StandardCharsets.UTF_8)) {
            String text = IOOperations.read(in);
            System.out.println(text);
        }
    }
}
