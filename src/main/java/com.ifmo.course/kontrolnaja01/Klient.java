package com.ifmo.course.kontrolnaja01;

import java.time.LocalDate;

public class Klient {
    public String name;
    public String surname;
    public LocalDate birthday;

    public Klient(String name, String surname, LocalDate birthday) {
        if (name == null || name.trim().length() < 2)
            throw new IllegalArgumentException("Введите имя правильно");
        if (surname == null || surname.trim().length() < 2)
            throw new IllegalArgumentException("Введите фамилию правильно");
        if (birthday == null)
            throw new IllegalArgumentException("Введите ДР правильно");
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }
}
