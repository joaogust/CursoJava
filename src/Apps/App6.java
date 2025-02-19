package Apps;
import JavaRecords.Person;
import JavaRecords.PersonRecord;

public class App6 {

    public static void main(String[] args) {
        Person person = new Person("João", "Gustavo", 19);
        System.out.println(person);

        PersonRecord personRecord1 = new PersonRecord("Ana", "Sophia", 17); // classe record
        System.out.println(personRecord1); // metodo toString é implementado
        // geters são implementados, com a única diferença de ser sem o get na frente.
        System.out.println(personRecord1.firstName());
        System.out.println(personRecord1.lastName());
        System.out.println(personRecord1.age());

        System.out.println("\n----------------\n");

        PersonRecord personRecord2 = new PersonRecord("Ana", "Sophia", 17);
        System.out.println(personRecord1.equals(personRecord2)); // metodo equals é implementado

        // PersonRecord personRecord3 = new PersonRecord(null, "Yanke", 26); << isso geraria uma NullPointerException
        /*
        Isso ocorre por conta do metodo requireNonNull(), que obriga que a string não seja nula.
         */

        System.out.println("\n----------------\n");

        PersonRecord personRecord3 = new PersonRecord("Israel", "Yanke"); // utiliza construtor com 2 parâmetros
        System.out.println(personRecord3);
        System.out.println(personRecord3.fullName());

        System.out.println("\n----------------\n");

        PersonRecord personRecord4 = PersonRecord.create("Otávio");
        System.out.println(personRecord4);
    }
}
