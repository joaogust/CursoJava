package Interfaces.DefaltMethod;

public class StringManipulatorImpl implements StringManipulator {

    @Override
    public String add(String a, String b) {
        return a+b;
    }

    @Override
    public String takeFirst(String s, int n) {
        return s.substring(0, n);
    }


}
