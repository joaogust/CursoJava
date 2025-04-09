package ArquivosEDiretorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp2 {

    public static void main(String[] args) throws IOException {

        Path root = Path.of("src", "ArquivosEDiretorios");

        Path d1 = root.resolve("d1");
        if(!Files.exists(d1)) {
        Files.createDirectory(root.resolve("d1")); // cria um diretório
        /*
        Se rodar mais uma vez ira dar uma excessão chamada: FileAlreadyExistsException
        Isso acontece porque o arquivo já existe, não é possível sobrescrevê-lo com esse método
         */
        }

        Path d3 = Files.createDirectories(d1.resolve(Path.of("d2", "d3")));

        Path d4 = Files.createFile(d3.resolve("d3.txt"));
        Path d5 = Files.createFile(d3.getParent().resolve("d2.txt")); // -> getParent() volta para o diretório anterior
        Path d6 = Files.createFile(d3.getParent().getParent().resolve("d1.txt"));

        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

    }
}
