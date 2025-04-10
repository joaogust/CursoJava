package ArquivosEDiretorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FilesApp5 {

    public static void main(String[] args) throws IOException {

        Path from = Path.of("src", "ArquivosEDiretorios", "file.txt");
//        Path to = from.getParent().resolve("file.txt");
        Path to = from.getParent().resolve(Path.of("files", "file2.txt"));

        Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        // StandardCopyOption.REPLACE_EXISTING >> substitui o arquivo de destino caso ele exista

        Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);
    }
}
