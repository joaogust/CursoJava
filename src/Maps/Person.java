package Maps;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {

    private final String first;
    private final String last;

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    @Override
    public String toString() {
        return first + " " + last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(first, person.first) && Objects.equals(last, person.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last);
    }

    @Override
    public int compareTo(Person o) {
        var ret =  first.compareTo(o.first);

        if (ret == 0) {
            return last.compareTo(o.last);
        }

        return ret;
    }
}
