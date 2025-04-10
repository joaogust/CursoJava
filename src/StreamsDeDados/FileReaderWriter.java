package StreamsDeDados;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderWriter {

    public static void main(String[] args) throws IOException {

        try (FileWriter out = new FileWriter("src/StreamsDeDados/out3.txt", StandardCharsets.UTF_8)) {
            out.write("Hello!");
        }

        try (FileReader in = new FileReader("src/StreamsDeDados/out3.txt", StandardCharsets.UTF_8)) {
            int c = in.read();
            StringBuilder s = new StringBuilder();
            while (c > -1) {
                s.append((char) c);
                c = in.read();
            }

            System.out.println(s);
        }
    }
}
