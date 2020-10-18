package com.ifmo.course.kontrolnaja01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AbonRazovi extends Abonement{


    LocalTime VizitStart = LocalTime.of(8, 00, 00);
    LocalTime VizitFinish = LocalTime.of(22, 00, 00);


    public AbonRazovi(Klient klient) {
        super(klient);
    }
}
