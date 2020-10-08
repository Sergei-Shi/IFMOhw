package com.ifmo.course.Lesson02;

public class Task02 {
    public static void main(String[] args) {
        //задача 2
        /*Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….*/
        System.out.println();
        System.out.println("Задача 2");
        int a = 2;
        int b = 1;
        do {
            System.out.println(a);
            a = a * 2;
            b = b + 1;
        } while (b <= 20);
    }

}
