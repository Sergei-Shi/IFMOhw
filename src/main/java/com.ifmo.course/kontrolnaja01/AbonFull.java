package com.ifmo.course.kontrolnaja01;

import java.time.LocalTime;

public class AbonFull extends Abonement{
    LocalTime VizitStart = LocalTime.of(8, 00, 00);
    LocalTime VizitFinish = LocalTime.of(22, 00, 00);

    public AbonFull(Klient klient) {
        super(klient);
    }
}
