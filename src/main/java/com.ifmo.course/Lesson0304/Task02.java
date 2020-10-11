package com.ifmo.course.Lesson0304;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        // Создайте массив из чётных чисел [2;20]
        // и выведите элементы массива в консоль в обратном порядке
        // (20 18 16 ... 4 2)
        int[] m1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println("массив \"до\" " + Arrays.toString(m1));

        for (int i = m1.length-1; i >= 0; i--) {
            System.out.print(m1[i] + " ");
        }
        // далее пытался вывести зеркальный массив.
        // выдает результат [20, 18, 16, 14, 12, 12, 14, 16, 18, 20]
//        for (int i = 0; i < m1.length; i++) {
//            m1[i] = m1[m1.length-1-i];
//        }
//        System.out.println("массив \"после\" " + Arrays.toString(m1));
    }
}
