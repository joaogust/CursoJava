package Listas.Exercício;

import java.util.ArrayList;
import java.util.List;
public class Employee {

    private String name;
    public enum Status {
        ACTIVE, INACTIVE
    }

    private Status status;

    public Employee(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }

    public static List<Employee> removeInactive(List<Employee> list) {

        var list2 = new ArrayList<Employee>(list.size());
        list2.addAll(list);

        for (int i = 0; i < list2.size(); i++)
            if (list2.get(i).status == Status.INACTIVE) {
                list2.remove(i);
            }
        return list2;
    }
}