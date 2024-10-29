package EstruturasDeRepetição;

public class labels {
    public static void main(String[] args) {
        for1:
        for(int i=0; i<10; i++) {
            for2:
            for(int j=i; j<10; j++) {
                System.out.println(j);
                if(i == 8 && j == 9)
                    break for1;
            }
        }
    }
}
