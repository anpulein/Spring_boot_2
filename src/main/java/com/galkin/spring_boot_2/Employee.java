package com.galkin.spring_boot_2;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String departament;

    public Employee() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return  "name=" + name.toString() + '&' +
                "surname=" + surname.toString() + '&' +
                "salary=" + String.valueOf(salary) + '&' +
                "departament=" + departament.toString();
    }
}
