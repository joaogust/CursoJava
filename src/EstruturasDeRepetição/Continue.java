package EstruturasDeRepetição;

public class Continue {
    public static void main(String[] args) {

        for(int i=0; i<200; i++) {
            if(i % 2 == 0) {
                continue; // descarta o resto do código dentro do for
            }
            System.out.println(i);
        }
        System.out.println("FIM");
    }
}
