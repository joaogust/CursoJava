package ArquivosEDiretorios;

import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp1 {

    public static void main(String[] args) {

        Path file1 = Path.of("src", "ArquivosEDiretorios", "file.txt");
        System.out.println(file1.toAbsolutePath());
        System.out.println(Files.exists(file1));
        /*
        Antes de verificar se o arquivo existe o Java transforma o Path em um caminho absoluto porque ele deve ter
        o caminho completo para saber se o arquivo realmente existe.
         */

        System.out.println(Files.isDirectory(file1)); // -> verifica se é um diretório
        System.out.println(Files.isRegularFile(file1)); // -> verifica se existe

        Path file2 = Path.of("src");
        System.out.println(Files.isDirectory(file2));
        System.out.println(Files.isRegularFile(file2));
    }
}
