package com.ifmo.course.lesson15.task01;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CompareName implements Comparator<Employee>// сравнение по имени в алфавитном порядке
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class CompareZp implements Comparator<Employee>// сравнение по зарплате по возрастанию
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());// -1(o1 меньше o2) 0(o1 равен о2) 1(o1 больше о2)
    }
}

class CompareAge implements Comparator<Employee>// сравнение по возрасту по возрастанию
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class CompareCompany implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2){
        return o1.getCompany().compareTo(o2.getCompany());
    }
}

public class EmployeeTask {
    // TODO::2) сортировать по имени
    public static void nameSort(List<Employee> employeeList){
        Collections.sort(employeeList, new CompareName());
        System.out.println(employeeList);
    }
    // TODO::3) сортировать по имени и зарплате
    public static void nameZpSort(List<Employee> employeeList){
        Collections.sort(employeeList, new CompareName().thenComparing(new CompareZp()));
        System.out.println(employeeList);
    }
    // TODO::4) сортировать по имени, зарплате, возрасту и компании
    public static void fullSort(List<Employee> employeeList){
        Collections.sort(employeeList, new CompareName().thenComparing(new CompareZp().thenComparing(new CompareAge().thenComparing(new CompareCompany()))));
        System.out.println(employeeList);
    }
    public static void main(String[] args) {
        // TODO::1) Создать список объетов List<Employee> (использовать метод employeeGenerator)
        List<Employee> rabotniki = Employee.employeeGenerator(10);
        System.out.println("изначальный список");
        System.out.println(rabotniki);
        System.out.println("список отсортирован по имени");
        nameSort(rabotniki);
        System.out.println("список отсортирован по имени и зарплате");
        nameZpSort(rabotniki);
        System.out.println("список отсортирован по имени, зарплате, возрасту и компании");
        fullSort(rabotniki);
    }
}
