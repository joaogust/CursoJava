package ModificadorStatic;

public class ExplicandoMain {
    public static void main(String[] args) {
        App3Java.main(null);
        /*
        Por que o metodo main é static e não é possível executá-lo sem o static?
        A classe ExplicandoMain, por exemplo, é uma classe como qualquer outra.
        Para JVM (máquina virtual que executa programas escritos em Java) não importa como são os objetos da sua classe
        o que importa é que existe um metodo em específico que ela esta interessada em executar, esse metodo é o main.
        O metodo main não é diferente de nenhum outro metodo, eu posso chamá-lo como fiz aqui em cima.
        A JVM pega o nome da classe que mandamos para ela executar, ela acha o metodo main e executa.
        Então ele é static porque ele é chamado diretamente na classe, como ExplicandoMain.
         */

        System.out.println();
        /*
        O System é uma classe com algumas funções de sistema, o out é um atributo static dentro dessa classe do tipo
        PrintStream, que é uma classe, e o println() é um metodo da classe PrintStream.
        Eu sei que ele é static porque eu estou acessando ele diretamente na classe, como eu fiz nesse
        exemplo: IdGeneratedAccount.getCurrentId().
         */
    }
}
