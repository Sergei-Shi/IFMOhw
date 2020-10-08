package com.ifmo.course.Lesson02;

public class Task04 {
    public static void main(String[] args) {
        //задача 4
        /*Написать код, который будет проверять попало ли случайно сгенерированное целое число
        из отрезка [10;500] в интервал (25;200) и выводить результат в консоль.
        Примеры работы программы:
        Число 345 не содержится в интервале (25;200)
        Число 110 содержится в интервале (25;200)*/
        System.out.println();
        System.out.println("Задача 4");
        int d = 10;
        int e = 500;
        int random = (int) (Math.random() * ((e-d)+1))+d;
        System.out.println("случайное число " + random);
        if (random < 25 || 200 < random) {
            System.out.println("Число " + random + " не содержится в интервале (25;200)");
        } else {
            System.out.println("Число " + random + " содержится в интервале (25;200)");
        }

    }
}
