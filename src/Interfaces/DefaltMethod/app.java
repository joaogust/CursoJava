package Interfaces.DefaltMethod;

public class app {
    public static void main(String[] args) {
        var s = new StringManipulatorImpl();
        System.out.println(s.upper("joão"));
        System.out.println(s.add("A", "na"));
        System.out.println(s.takeFirst("Sophia", 4));

        System.out.println(StringManipulator.lower("JAVA"));
    }
}
