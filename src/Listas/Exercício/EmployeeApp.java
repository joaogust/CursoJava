package Listas.Exercício;

import java.util.List;

import static Listas.Exercício.Employee.Status.*;

public class EmployeeApp {

    public static void main(String[] args) {

        var employees = List.of(
                new Employee("Andrey", INACTIVE),
                new Employee("João", ACTIVE),
                new Employee("Vinícius", ACTIVE),
                new Employee("Elton", INACTIVE),
                new Employee("Randú", ACTIVE),
                new Employee("Renan", INACTIVE)
        );

        var activeEmployees = Employee.removeInactive(employees);

        System.out.println(employees);
        System.out.println(activeEmployees);
    }
}
