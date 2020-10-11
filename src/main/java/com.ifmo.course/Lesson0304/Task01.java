package com.ifmo.course.Lesson0304;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        //Заполните массив на N элементов случайным целыми числами
        // и выведете максимальное, минимальное и среднее значение
        int[] m1 = new int[10];
        int min = 0;
        int max = m1.length;
        for (int i = 0; i < m1.length; i++) {
            m1[i] = (int) ((Math.random() * (max - min + 1)) + min);
        }
        System.out.println(Arrays.toString(m1)); //смотрим на получившийся массив m1
        Arrays.sort(m1); // сортируем элементы массива m1 от минимума к максимуму
        System.out.println(Arrays.toString(m1)); //смотрим на получившийся отсортированный массив m1
        int min1 = m1[0];
        int max1 = m1[m1.length-1];
        int srednee = (max1 + min1) / 2;

        System.out.println("minimalnoe chiclo = " + min1);
        System.out.println("maximalnoe chiclo = " + max1);
        System.out.println("srednee chiclo = " + srednee);
    }
}
