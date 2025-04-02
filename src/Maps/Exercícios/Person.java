package Maps.Exercícios;

public class Person implements Comparable<Person>{

    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}
