package com.ifmo.course.Lesson11;

public enum Task02 {
    // 2. Задача: написать enum, который перечисляет планеты Солнечной системы
    // и возвращает массу планеты, ее радиус и радиус орбиты.
    NEPTUNE(10, 50, 100), MARS(100, 5, 10), EARHT(30, 505, 1000);
    private int massa;
    private int radiusPlanet;
    private int radiusOrbit;

    Task02(int massa, int radiusPlanet, int radiusOrbit) {
        this.massa = massa;
        this.radiusPlanet = radiusPlanet;
        this.radiusOrbit = radiusOrbit;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getRadiusPlanet() {
        return radiusPlanet;
    }

    public void setRadiusPlanet(int radiusPlanet) {
        this.radiusPlanet = radiusPlanet;
    }

    public int getRadiusOrbit() {
        return radiusOrbit;
    }

    public void setRadiusOrbit(int radiusOrbit) {
        this.radiusOrbit = radiusOrbit;
    }
}
