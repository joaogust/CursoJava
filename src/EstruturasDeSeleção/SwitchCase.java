package EstruturasDeSeleção;

public class SwitchCase {
    public static void main(String[] args) {
        int days, month;
        var scanner = new java.util.Scanner(System.in);

        System.out.print("Digite a qtd de dias do mês: ");

        month = scanner.nextInt();
        // forma switch expressions
        days = switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4,6,9,11 -> 30;
            default -> {
                System.out.println("Inválido");
                yield 0;
            }
        };
        // forma padrão
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                System.out.println("Inválido");
                days = 0;
                break;
        }

        System.out.println("A qtd de dias no mês " + month + " é igual a: " + days);

    }


}
