package com.ifmo.course.Lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;

    public Employee(String name, String company, int salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return  name + ", " +'\'' +
                company + '\'' +
                ", zp=" + salary +
                ", age=" + age +
                '}';
    }

    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"};
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"};
        int ageMin = 21;
        int ageMax = 60;
        int zpMin = 100;
        int zpMax = 200;

        if(num <= 0){
            return Collections.emptyList();
        }
        Random random = new Random();
        List<Employee> employees = new ArrayList<>(num);
        int name1 = names.length;
        int company1 = companies.length;
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(
                    names[random.nextInt(name1)],
                    companies[random.nextInt(company1)],
                    (int) (Math.random()*(zpMax-zpMin + 1) +zpMin),
                    (int) (Math.random()*(ageMax-ageMin + 1) + ageMin)));
        }
        return employees;
    }
}

