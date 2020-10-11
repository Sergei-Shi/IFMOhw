package com.ifmo.course.Lesson0304;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        // Создайте массив из 11 случайных целых чисел из отрезка [-1;1],
        // выведите массив в консоль. Определите какой элемент встречается
        // в массиве чаще всего и выведите информацию об этом в консоль.
        // Если два каких-то элемента встречаются одинаковое количество раз,
        // то не выводите ничего.

        int[] massiv = new int[11];
        int min = -1;
        int max = 1;

        int minusCount = 0; // счетчик "-1"
        int nolCount = 0; // счетчик "0"
        int plusCount = 0; // счетчик "1"

        for (int i = 0; i < massiv.length; i++) { // Создали массив из 11 случайных целых чисел из отрезка [-1;1],
            massiv[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        System.out.println(Arrays.toString(massiv)); // выведли массив в консоль.

        for (int i = 0; i < massiv.length; i++) { // подсчет кол-ва повторений "-1"
            if (massiv[i] == -1) {minusCount++;}
        }
        System.out.println("повторений \"-1\" - " + minusCount);

        for (int i = 0; i < massiv.length; i++) { // подсчет кол-ва повторений "0"
            if (massiv[i] == 0) {nolCount++;}
        }
        System.out.println("повторений \"0\" - " + nolCount);

        for (int i = 0; i < massiv.length; i++) { // подсчет кол-ва повторений "1"
            if (massiv[i] == 1) {plusCount++;}
        }
        System.out.println("повторений \"1\" - " + plusCount);

        if (minusCount > nolCount && minusCount > plusCount) {
            System.out.println("Чаще всего встречается \"-1\". Число повторений - " + minusCount);
        } else if (nolCount > minusCount && nolCount > plusCount) {
            System.out.println("Чаще всего встречается \"0\". Число повторений - " + nolCount);
        } else if (plusCount > minusCount && plusCount > nolCount) {
            System.out.println("Чаще всего встречается \"1\". Число повторений - " + plusCount);
        }

    }
}
