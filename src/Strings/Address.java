package Strings;

public class Address {
    // ------------- Aula 161 ------------- //
    private String street;
    private int number;
    private String complement;
    private String city;
    private String state;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", complement='" + complement + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    /*
    Se não está ocorrendo concatenação dentro de loops, fazer essa concatenação usando o '+' não vai causar prejuísos
    ao código, ele vai funcionar tão bom quanto um StringBuilder.
     */

}
