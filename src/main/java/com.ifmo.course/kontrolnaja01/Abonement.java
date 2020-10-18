package com.ifmo.course.kontrolnaja01;


import java.time.LocalDateTime;
import java.time.LocalTime;

public class Abonement {
    int id;
    public Klient klient;
    public LocalDateTime registrationStart;
    public LocalDateTime registrationFinish;

    public Abonement(Klient klient) {
        this.klient = klient;
    }
}
