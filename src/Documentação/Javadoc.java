package Documentação;

import java.lang.Deprecated;

/**
 * Classe do meu programa
 *
 * @author João Gustavo
 * @version 1.0
 * @since 1.0
 */
@Deprecated
public class Javadoc {
    /**
     * Método main
     * @param args Parâmetros de linha de comando.
     */
    public static void main(String[] args) {
    }

    /**
     * Este é um método
     * @param x O booleano.
     */
    private static void m1(int x){
    }

    /**
     *
     * @param nUm Número 1.
     * @param nDois Número 2.
     * @return Por enquanto, true.
     */
    private static boolean m2(double nUm, double nDois) {
        return true;
    }
}
/*
    Para exportar o javadoc, clique no menu Tools e depois em Javadoc.
    Coloque somente os openfiles (arquivo que está aberto).
    Visibility levels: private.
    @Author @Vertion
    Command line arguments:
    -encoding utf8 -docencoding utf8 -charset utf8
 */