package com.ifmo.course.Lesson22.Task0305;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class University {
    private List<Course> courses = new ArrayList<>(); // создан список курсов // поле класса "University"

    public boolean addCourse(Course course) { // метод добавления в список курсов нового курса. Принимает объект класса "Course"
        return courses.add(Objects.requireNonNull(course)); // вывод - в список курсов добавлен объект класса "Course" с проверкой на null
    }

    public List<Course> getCourses() { // метод. покажет список курсов
        return courses;
    }

    //TODO:: Написать реализацию метода public List filtered(Predicate filter) класса University.
    public List<Course> filtered(Predicate<Course> filter){ // Predicate вернет true/false
        List<Course> filteredCourses = new ArrayList<>();
        // TODO:: если курс подходит по filter, добавить его в filteredCourses
        for (Course course: courses) { // для каждого элемента класса "Course" из списка курсов "courses"
            if (filter.test(course)) { // если метод "test" вернет true
                filteredCourses.add(course); // то в "filteredCourses" добавится данный элемент класса "Course"
            }
        }
        return filteredCourses;
    }
    public List<Course> filtered2(Predicate<Course> filter, Predicate<Course> filter2){ // Predicate вернет true/false
        List<Course> filteredCourses = new ArrayList<>();
        for (Course course: courses) { // для каждого элемента класса "Course" из списка курсов "courses"
            if (filter.test(course) && filter2.test(course)) { // если метод "test" вернет true по двум условиям
                filteredCourses.add(course); // то в "filteredCourses" добавится данный элемент класса "Course"
            }
        }
        return filteredCourses;
    }
    public List<Course> filtered3(Predicate<Course> filter, Predicate<Course> filter2, Predicate<Course> filter3){ // Predicate вернет true/false
        List<Course> filteredCourses = new ArrayList<>();
        for (Course course: courses) { // для каждого элемента класса "Course" из списка курсов "courses"
            if (filter.test(course) && filter2.test(course) && filter3.test(course)) { // если метод "test" вернет true по трем условиям
                filteredCourses.add(course); // то в "filteredCourses" добавится данный элемент класса "Course"
            }
        }
        return filteredCourses;
    }

}
