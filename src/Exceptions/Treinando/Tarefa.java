package Exceptions.Treinando;

public class Tarefa {
    private static final int MAXTAREFAS = 10;
    private static int qtdTarefas;

    private String nome;
    private int prioridade;
    private boolean feito;

    public Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
        qtdTarefas++;
    }

    public static int getQtdTarefas() {
        return qtdTarefas;
    }

    public static int getMAXTAREFAS() {
        return MAXTAREFAS;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public boolean isFeito() {
        return feito;
    }

    public void realizarTarefa() {
        if(feito) {
            System.out.println("A tarefa " + nome + " já havia sido concluída.");
        } else {
            System.out.println("A tarefa " + nome + " foi realizada!");
        }
        feito = true;
    }

    public static void menu() {
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Marcar uma tarefa como concluída");
        System.out.println("4 - Remover uma tarefa");
        System.out.println("5 - Sair");
        System.out.print("\nDigite a opção desejada: ");
    }

    public static Tarefa newTarefa() {
        var scanner = new java.util.Scanner(System.in);


        System.out.print("Digite o nome da tarefa: ");
        String n = scanner.nextLine();

        System.out.print("Digite a prioridade (ALTA(1), MÉDIA(2) ou BAIXA(3)) da tarefa: ");
        int p = Integer.parseInt(scanner.nextLine());

        System.out.println("\nTarefa criada com sucesso!\n\nDigite Enter para continuar...");
        scanner.nextLine();

        return new Tarefa(n, p);
    }

    public static void listar(Tarefa[] t) {
        System.out.println("Tarefas:\n\n");
        if (getQtdTarefas()>0) {
            for(int i=1; i <= getQtdTarefas(); i++) {
                String p;
                if(t[i-1].getPrioridade() == 1) {
                    p = "ALTA";
                } else if(t[i-1].getPrioridade() == 2) {
                    p = "MÉDIA";
                } else {
                    p = "BAIXA";
                }
                System.out.println(i + " - " + t[i-1].getNome() + " | Prioridade: " + p + " | " + (t[i-1].isFeito() ? "[X]" : "[ ]"));
            }
        } else {
            System.out.println("Nenhuma tarefa.");
        }
    }

    public static void concluir(Tarefa[] t) {
        listar(t);
        System.out.print("Digite a tarefa você deseja concluir: ");
        var scanner = new java.util.Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        t[n-1].realizarTarefa();

        System.out.println("Digite Enter para continuar...");
        scanner.nextLine();
    }

    public static void excluir(Tarefa[] t) {
        listar(t);
        System.out.print("Digite a tarefa você deseja excluir: ");
        var scanner = new java.util.Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i;
        for(i = n ; i<getQtdTarefas()-1; i++) {
            t[i-1].nome = t[i].nome;
            t[i-1].prioridade = t[i].prioridade;
            t[i-1].feito = t[i].feito;
        }
        qtdTarefas--;
        t[getQtdTarefas()] = null;

        System.out.println("Tarefa excluida com sucesso!");
        System.out.println("Digite Enter para continuar...");
        scanner.nextLine();
    }
}