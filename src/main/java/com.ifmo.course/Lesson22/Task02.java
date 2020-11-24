package com.ifmo.course.Lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task02 {
    // TODO:: Переписать компараторы из lesson15/hw с использованием синтаксиса лямбд

    public static void main(String[] args) {
        // TODO::1) Создать список объетов List<Employee> (использовать метод employeeGenerator)
        List<Employee> rabotniki = Employee.employeeGenerator(10);
        System.out.println(rabotniki);

        //вариант 1
        Comparator<Employee> CompareName = (o1, o2) -> o1.getName().compareTo(o2.getName());
        Comparator<Employee> CompareZp = (o1, o2) -> Integer.compare(o1.getSalary(), o2.getSalary());
        Comparator<Employee> CompareAge = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());
        Comparator<Employee> CompareCompany = (o1, o2) -> o1.getCompany().compareTo(o2.getCompany());

        // TODO::2) сортировать по имени
        rabotniki.sort(CompareName);
        System.out.println(rabotniki);
        // TODO::3) сортировать по имени и зарплате
        rabotniki.sort(CompareName.thenComparing(CompareZp));
        System.out.println(rabotniki);
        // TODO::4) сортировать по имени, зарплате, возрасту и компании
        rabotniki.sort(CompareName.thenComparing(CompareZp.thenComparing(CompareAge.thenComparing(CompareCompany))));
        System.out.println(rabotniki);

        //вариант 2
        // TODO::2) сортировать по имени
        rabotniki.sort(Comparator.comparing(Employee::getName));
        System.out.println(rabotniki);
        // TODO::3) сортировать по имени и зарплате
        rabotniki.sort(
                Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getSalary)
        );
        System.out.println(rabotniki);
        // TODO::4) сортировать по имени, зарплате, возрасту и компании
        rabotniki.sort(
                Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getSalary)
                .thenComparing(Employee::getAge)
                .thenComparing(Employee::getCompany)
        );
        System.out.println(rabotniki);

    }

}
