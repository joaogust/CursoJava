package ClassesWrappers.Exercícios.Ex1;

public class OperationImpl implements Operation{

    @Override
    public Integer execute(Integer n1, Integer n2) {
        // if ternário
        n1 = n1 == null ? 0 : n1;
        n2 = n2 == null ? 0 : n2;
        return n1 + n2;
    }

    public static void main(String[] args) {

        Operation n = new OperationImpl();

        int h = n.execute(10, 40);
        System.out.println(h);

        h = n.execute(null, 40);
        System.out.println(h);
    }
}
