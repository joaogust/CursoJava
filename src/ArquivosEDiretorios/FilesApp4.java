package ArquivosEDiretorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp4 {

    public static void main(String[] args) throws IOException {

        Path file = Path.of("src", "ArquivosEDiretorios", "myfile.txt");
        Files.createFile(file);

//        Files.delete(file);
//        Se o arquivo não existe ele faz uma excessão

        Files.deleteIfExists(file);
        /*
        Para apagar um diretório é necessário que ele esteja totalmente vazio.
         */
    }
}
