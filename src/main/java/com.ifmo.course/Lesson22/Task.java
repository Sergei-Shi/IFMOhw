package com.ifmo.course.Lesson22;

import com.ifmo.course.Lesson22.Task0305.Course;
import com.ifmo.course.Lesson22.Task0305.University;

import java.util.List;

public class Task {

    // Использовать реализованный в п.3 метод "filtered" для получения списков курсов:
//    продолжительностью менее 3х месяцев;
//    стоимостью менее 20000;
//    курсов с названием JJD;
//    продолжительностью менее 3х месяцев и стоимостью менее 20000;
//    продолжительностью менее 3х месяцев и стоимостью менее 20000 или курсов с названием JJD;

    public static void main(String[] args) {
        University univer = new University(); // создан объект "univer" класса "University"
        univer.addCourse(Course.getInstance()); // в "univer" добавлен новый курс
        univer.addCourse(Course.getInstance());
        univer.addCourse(Course.getInstance());
        univer.addCourse(Course.getInstance());
        univer.addCourse(Course.getInstance());
        univer.addCourse(Course.getInstance());

        System.out.println(univer.getCourses());

        //    отфильтрованный список курсов продолжительностью менее 3х месяцев;
        List<Course> filter1 = univer.filtered(course -> course.getDuration() < 3);
        System.out.println(filter1);
        //    отфильтрованный список курсов стоимостью менее 20000;
        List<Course> filter2 = univer.filtered(course -> course.getPrice() < 20000);
        System.out.println(filter2);
        //    отфильтрованный список курсов с названием JJD;
        List<Course> filter3 = univer.filtered(course -> course.getName() == "JJD");
        System.out.println(filter3);
        //    отфильтрованный список курсов с продолжительностью менее 3х месяцев и стоимостью менее 20000;
        List<Course> filter4 = univer.filtered2(course -> course.getDuration() < 3, course -> course.getPrice() < 20000);
        System.out.println(filter4);
        //   отфильтрованный список курсов с продолжительностью менее 3х месяцев и стоимостью менее 20000 или курсов с названием JJD;
        List<Course> filter5 = univer.filtered3(course -> course.getDuration() < 3, course -> course.getPrice() < 20000, course -> course.getName() == "JJD");
        System.out.println(filter5);

        // Используя метод foreach увеличить стоимость всех курсов на 10000.
        univer.getCourses().forEach(course -> course.setPrice(course.getPrice() + 10000));
        univer.getCourses().forEach(System.out::println);

    }
}
