package com.ifmo.course.Lesson05;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        // задача 2
        // Найти количество вхождений одной строки в другую.
        // Например, строка "дом" встречается в строке "дом домик домой одомашненный" 4 раза

        String predlozhenie = "дом домик домой одомашненный";
        String iskomoeSlovo = "дом";
        String[] a = predlozhenie.split(" ");
        System.out.println(Arrays.toString(a));

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].contains(iskomoeSlovo)) {
                count++;
            }
        }
        System.out.println("Слово - " + iskomoeSlovo + " встречается в строке " + count + " раз");

    }
}
