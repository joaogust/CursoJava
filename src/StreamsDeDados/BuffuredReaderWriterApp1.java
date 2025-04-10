package StreamsDeDados;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BuffuredReaderWriterApp1 {

    public static void main(String[] args) throws IOException {

        try (BufferedWriter out = new BufferedWriter(new FileWriter("src/StreamsDeDados/out5.txt", StandardCharsets.UTF_8))) {
            IOOperations.write(out, "Hello! I'm learning Java");
            out.flush(); // -> Pega todas as informações que ainda não foram enviados para a saída (armazenados no buffer) e joga para a saída.
        }
        /*
        O BufferedWriter junta os dados e joga no arquivo de uma vez só.
        Isso é bom porque precisa de menos operações de I/O (escrita), o que seria mais computacionalmente custoso.
         */

        try (BufferedReader in = new BufferedReader(new FileReader("src/StreamsDeDados/out5.txt", StandardCharsets.UTF_8))) {
            String text = IOOperations.read(in);
            System.out.println(text);
        }

        /*
        Buffer -> significa grupos de dados
        BufferedReader -> ele é capaz de ler informações agrupando de uma forma conjunta.
        O BufferedReader basicamente faz uma ponte entre o dado que você quer ler com a sua aplicação.
        - Recebe como parâmetro um outro reader que é o reader utilizado para ler os lados.

        Qual a vantagem disso?
        Leitura mais fácil com o readLine().
        Ele pega todos os carateres, junta tudo e retorna uma s tring completa.
         */
    }
}
