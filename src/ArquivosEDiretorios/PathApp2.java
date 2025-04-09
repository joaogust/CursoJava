package ArquivosEDiretorios;

import java.nio.file.Path;

public class PathApp2 {

    public static void main(String[] args) {

//        Path p1 = Path.of("/home"); // -> '/' transforma o home no primeiro diretório do caminho
        Path p1 = Path.of("home");
        Path p2 = Path.of("jgust");
        Path p3 = Path.of("log.out");

        // Instâncias de Path são imutáveis
        Path p4 = p1.resolve(p2).resolve(p3);
        Path p5 = p4.toAbsolutePath(); // -> Mostra o caminho desde a raiz
        System.out.println(p4);
        System.out.println(p5);
    }
}
