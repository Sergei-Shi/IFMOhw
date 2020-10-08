package com.ifmo.course.Lesson02;

public class Task05 {
    public static void main(String[] args) {
        //задача 5
        /*Задача на синтаксис switch.
        Дана целочисленная переменная (номер билета от пользователя):
        если ее значение 111, 222 или 333 сообщить пользователю, что он получит "Книгу",
        если ее значение 444 или 555 сообщить пользователю, что он получит "Телефон",
        если ее значение 777 сообщить пользователю, что он получит "Ноутбук".
        В остальных случаях сообщить, что приза нет.*/
        System.out.println();
        System.out.println("Задача 5");
        int ticket = 777;
        switch (ticket) {
            case 111:
            case 222:
            case 333:
                System.out.println("Книга");
                break;
            case 444:
            case 555:
                System.out.println("Телефон");
                break;
            case 777:
                System.out.println("Ноутбук");
                break;
            default:
                System.out.println("Приза нет");
        }

    }
}
