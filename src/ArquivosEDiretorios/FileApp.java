package ArquivosEDiretorios;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

public class FileApp {

    public static void main(String[] args) {

        File file = new File(".");

        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile()); // -> retorna um file
        System.out.println(file.getAbsolutePath()); // -> retorna uma String
        System.out.println(Arrays.toString(file.listFiles()));

        Path path = file.toPath(); // -> transforma um File para Path
        File file1 = path.toFile(); // -> transforma um Path em um File
        System.out.println(file1);
    }
}
