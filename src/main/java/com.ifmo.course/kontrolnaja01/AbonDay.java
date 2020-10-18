package com.ifmo.course.kontrolnaja01;

import java.time.LocalTime;

public class AbonDay extends Abonement{
    LocalTime VizitStart = LocalTime.of(8, 00, 00);
    LocalTime VizitFinish = LocalTime.of(16, 00, 00);

    public AbonDay(Klient klient) {
        super(klient);
    }
}
