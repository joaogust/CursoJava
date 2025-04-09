package ArquivosEDiretorios;

import java.nio.file.Path;

public class PathApp1 {

    public static void main(String[] args) {
        // -> C:\System\Java\file.exe
        Path p1 = Path.of("C:", "System", "Java", "file.exe"); // >> Caminho em um sistema de arquivos
        System.out.println(p1);

        Path p2 = p1.getFileName(); // retorna o nome do arquivo em si
        System.out.println(p2);

        Path p3 = p1.getRoot(); // raiz do caminho
        System.out.println(p3);
    }
}
