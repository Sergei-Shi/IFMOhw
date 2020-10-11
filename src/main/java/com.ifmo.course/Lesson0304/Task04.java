package com.ifmo.course.Lesson0304;

import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        // Разобрать методы класса Arrays: compare, compareUnsigned, mismatch

        // compare() сравнивает 2 масива лексикой (по буквам).
        // если массивы равны - возвращает "0"
        // если 1 массив больше второго - возвращает "1"
        // если 1 массив меньше второго - возвращает "-1
        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {1, 2, 3, 4, 5};
        int[] m3 = {1, 2, 10, 4, 5};

        System.out.println("Arrays.compare");
        System.out.println(Arrays.compare(m1, m2)); // 0
        System.out.println(Arrays.compare(m2, m3)); // -1
        System.out.println(Arrays.compare(m3, m2)); // 1

        // compareUnsigned() сравнивает 2 масива лексикой (по буквам) в границах заданного "среза"
        System.out.println("Arrays.compareUnsigned");
        System.out.println(Arrays.compareUnsigned(m1, 0, 3, m2, 0, 3 ));// 0
        System.out.println(Arrays.compareUnsigned(m2, 0, 3, m3, 0, 3));// -1
        System.out.println(Arrays.compareUnsigned(m3, 0, 3, m2, 0, 3));// 1

        // mismatch() сравнивает 2 масива. находит и возвращает индекс первого несответствия между ними
        // сли несоответствий нет возвращает "-1"
        System.out.println("Arrays.mismatch");
        System.out.println(Arrays.mismatch(m1, m2));
        System.out.println(Arrays.mismatch(m2, m3));
        System.out.println(Arrays.mismatch(m3, m2));
    }
}
