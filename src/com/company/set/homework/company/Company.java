package com.company.set.homework.company;

import java.util.List;

public class Company {
    private List<Employee> employees;
    private String companyName;

    public Company(String companyName, List<Employee> employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public float getAverage() {
        float sum = 0;

        for (int i = 0; i < this.employees.size(); i++) {
            sum += this.employees.get(i).getAge();
        }

        return sum / this.employees.size();
    }

    public Employee getEmployee() {
        int random = (int)(Math.random() * 10);
        if (random >= this.employees.size()) {
            return getEmployee();
        }
        else return this.employees.get(random);
    }

}
