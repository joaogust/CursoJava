package ArquivosEDiretorios.Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Verifique no command prompt:
// cd C:\Users\Anderson\IdeaProjects\CursoJava
// dir /a/s
public class Exercise1 {

    public static void main(String[] args) throws IOException{
        Path initialDir = Path.of("");
        System.out.println(initialDir.toAbsolutePath());

        System.out.println(calculateSize(initialDir) + " bytes");
    }

    private static long calculateSize(Path initialDir) throws IOException {
        long totalSize = 0;
        try (var files = Files.newDirectoryStream(initialDir)) {
            for (Path file : files) {
                if (Files.isDirectory(file))
                    totalSize += calculateSize(file);
                else
                    totalSize += Files.size(file);
            }
        }

        return totalSize;
    }
}
