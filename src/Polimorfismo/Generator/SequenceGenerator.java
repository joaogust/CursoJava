package Polimorfismo.Generator;

public class SequenceGenerator implements Generator {

    public int current = 1;

    @Override
    public int next() {
        return current++;
    }
}
