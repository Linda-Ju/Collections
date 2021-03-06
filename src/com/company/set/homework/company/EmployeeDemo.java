package com.company.set.homework.company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {

        List<Employee> javaEmployees = new ArrayList<>();
        javaEmployees.add(new Employee("George",35, "J12", "Microsoft"));
        javaEmployees.add(new Employee("Dana",29, "H15", "Microsoft"));
        javaEmployees.add(new Employee("Harry",28, "U23", "Microsoft"));

        List<Employee> javascriptEmployees = new ArrayList<>();
        javascriptEmployees.add(new Employee("Nathan",31, "I91", "Google"));
        javascriptEmployees.add(new Employee("Jane",42, "A22", "Google"));
        javascriptEmployees.add(new Employee("Jordan",22, "O23", "Google"));

        Company microsoft = new Company("Microsoft", javaEmployees);
        Company google = new Company("Google", javascriptEmployees);
        System.out.println("The average age of Microsoft employees is " + microsoft.getAverage());
        System.out.println("The average age of Google employees is " + google.getAverage());
    }
}
