package ArquivosEDiretorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp6 {

    public static void main(String[] args) throws IOException {

        try (var files = Files.newDirectoryStream(Path.of(""))) {
            for (Path path : files) {
                System.out.println(path + " - " + Files.isDirectory(path));
            }
        }
        System.out.println();
        try (var files = Files.newDirectoryStream(Path.of(""), ".*")) {
            // glob -> mostra só os arquivos/diretórios com determinada formatação
            for (Path path : files) {
                System.out.println(path + " - " + Files.isDirectory(path));
            }
        }
        System.out.println();
        try (var files = Files.newDirectoryStream(Path.of(""), "*.md")) {
            for (Path path : files) {
                System.out.println(path + " - " + Files.isDirectory(path));
            }
        }
    }
}
