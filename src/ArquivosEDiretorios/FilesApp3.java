package ArquivosEDiretorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp3 {

    public static void main(String[] args) throws IOException {

        Path tempDir = Files.createTempDirectory("app_"); // -> Cria diretório temporário
        Path tempDir2 = Files.createTempDirectory(Path.of(""), "app_");
        System.out.println(tempDir);
        System.out.println(tempDir2);

        Path tempFile = Files.createTempFile("app_", null);
        Path tempFile2 = Files.createTempFile(Path.of(""), "app_", null);
        System.out.println(tempFile);
        System.out.println(tempFile2.toAbsolutePath());
    }
}
