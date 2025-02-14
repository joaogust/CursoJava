package Interfaces.DefaltMethod;

public class StringManipulatorImpl implements StringManipulator, CharactherChanger {

    @Override
    public String add(String a, String b) {
        return a+b;
    }

    @Override
    public String takeFirst(String s, int n) {
        return s.substring(0, n);
    }

    @Override
    public String upper(String s) {
        return CharactherChanger.super.upper(s);
    }
}
