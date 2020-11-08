package com.ifmo.course.lesson15.task01;
// Создать список объетов List<Employee> (использовать метод employeeGenerator)
// и сортировать по:
// имени
// имени и зарплате
// имени, зарплате, возрасту и компании

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Employee {
    private String name;
    private String company;
    private int salary;
    private int age;
    // TODO: конструктор, геттеры и сеттеры

    public Employee(String name, String company, int salary, int age) { // конструктор. принимает все свойства
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
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний
        int ageMin = 21;
        int ageMax = 60;
        int zpMin = 100;
        int zpMax = 200;

        if(num <= 0){//защита от NullPointerException при некорректном вводе
            return Collections.emptyList(); // выдаст пустой список (неизменяемый). возвращать null это плохо.
                                            // Поэтому лучше вернуть пустю immutable коллекию чем просто null.
                                            // Это способствует уменьшению возникновения таких эксепшенов как NullPointerException
        }
        Random random = new Random(); //создан объект "random" для генерации случайных чисел
        List<Employee> employees = new ArrayList<>(num);// создается коллекция с изначальной емкостью размером "num"
        int name1 = names.length;
        int company1 = companies.length;
        // добавление num объектов Employee в список (employees)
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(
                    names[random.nextInt(name1)],
                    companies[random.nextInt(company1)],
                    (int) (Math.random()*(zpMax-zpMin + 1) +zpMin),
                    (int) (Math.random()*(ageMax-ageMin + 1) + ageMin))); // TODO: объекты создавать с рандомными значениями. Возраст от 21 до 60 и не забудьте про зп
        }
        return employees;
    }
}
