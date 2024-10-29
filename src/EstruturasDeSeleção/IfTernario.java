package EstruturasDeSeleção;

public class IfTernario {
    public static void main(String[] args) {
        int age = 18;

        String text = age >= 18 ? "Maior de idade" : "Menor de idade";

        System.out.println(text);
        /*
        Esse tipo de if só é possível em casos de dois caminhos,
        sendo obrigatório a utilização de um retorno para cada um.
         */
    }
}
