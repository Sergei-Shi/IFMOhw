package com.ifmo.course.Lesson02;

public class Task03 {
    public static void main(String[] args) {
        //задача 3
        /*Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….*/
        System.out.println();
        System.out.println("Задача 3");
        int c = 90;
        do {
            System.out.println(c);
            c = c - 5;
        } while (c >= 0);
    }
}
