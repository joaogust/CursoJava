package Exceptions.Treinando;

//Adicionar tarefa (com nome e prioridade: ALTA(1), MÉDIA(2) ou BAIXA(3)).
//Listar tarefas (exibir tarefas pendentes e concluídas separadamente).
//Marcar uma tarefa como concluída.
//Remover uma tarefa.
//Salvar as tarefas em um arquivo para persistência dos dados.
//Carregar as tarefas do arquivo ao iniciar o programa.

public class main {

    public static void limparTela() {
        for(int i = 0; i<50; i++) {
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Tarefa[] t = new Tarefa[Tarefa.getMAXTAREFAS()];

        int g = 0;

        var scanner = new java.util.Scanner(System.in);

        do{
            Tarefa.menu();

            g = Integer.parseInt(scanner.nextLine());

            switch(g) {
                case 1 -> t[Tarefa.getQtdTarefas()] = Tarefa.newTarefa();
                case 2 -> {
                    Tarefa.listar(t);
                    System.out.println("\nDigite Enter para continuar...");
                    scanner.nextLine();
                }
                case 3 -> {
                    Tarefa.concluir(t);
                }
                case 4 -> {
                    Tarefa.excluir(t);
                }
                case 5 -> {
                    continue;
                }
                default -> {
                    System.out.println("Número digitado incorreto.");
                    System.out.println("\nDigite Enter para continuar...");
                }
            }

            limparTela();
        } while (g!=5);

    }
}
