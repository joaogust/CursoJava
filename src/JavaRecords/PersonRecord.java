package JavaRecords;

import java.util.Objects;

public record PersonRecord(String firstName, String lastName, int age) {

    private static final int DEFALT_AGE = 0;

    // private String date;
    /*
    Não pode ser instanciado, uma vez que não é final e está dentro de uma classe imutável (record)
     */

    public PersonRecord { // altera o construtur principal /\
        Objects.requireNonNull(firstName);
        Objects.requireNonNull(lastName);
    }

    public PersonRecord(String firstName, String lastName) {
        this(firstName, lastName, DEFALT_AGE);
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public static PersonRecord create(String name) {
        return new PersonRecord(name, "");
    }
}
