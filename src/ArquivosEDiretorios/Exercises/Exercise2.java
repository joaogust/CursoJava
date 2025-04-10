package ArquivosEDiretorios.Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        Path directoryPath = Path.of("src", "ArquivosEDiretorios", "Exercises", "Directory");

        if (!Files.exists(directoryPath))
            Files.createDirectory(directoryPath);

        createFile(directoryPath);
    }

    private static void createFile(Path directoryPath) throws IOException {
        String fileName = "file_" + System.currentTimeMillis() + ".txt";
        Files.createFile(directoryPath.resolve(Path.of(fileName)));
    }
}
