package Interfaces.DefaltMethod;

public interface CharactherChanger {

    default String upper(String s) {
        return "*" + s.substring(1);
    }

    /*
    Toda vez que aparecer esse problema de ambiguidade, o chamado Diamond Problem, deve-se
    sobrescrever o metodo, chamando qual metodo deve ser chamado, ou mudando o metodo.

    EX:
    @Override
    public String upper(String s) {
        return StringManipulator.super.upper(s);
    }
    ou:
    @Override
    public String upper(String s) {
        return CharactherChanger.super.upper(s);
    }
     */
}
