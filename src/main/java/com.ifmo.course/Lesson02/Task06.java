package com.ifmo.course.Lesson02;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        //задача 6
        /*Программа загадывает число в диапазоне [1;9]
        Пользователь вводит число с клавиатуры
        Программа в зависимости от введенного числа выводит в консоль следующее:
        "загаданное число больше"
        "загаданное число меньше"
        "Вы угадали" (программа завершает работу)
        если введен 0, выводит "выход из программы" (программа завершает работу)*/

        System.out.println();
        System.out.println("Задача 6");
        int f = 1;
        int g = 9;
        int random2 = (int) (Math.random()*((g-f)+1))+f;
        System.out.println("случайное число " + random2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int chislo = scanner.nextInt();
        while (chislo != random2 && chislo != 0) {
            if (chislo < random2 && chislo != 0) {
                System.out.println("загаданное число больше");
            } else if (chislo > random2) {
                System.out.println("загаданное число меньше");
            }
            System.out.println("введите число");
            int chislo2 = scanner.nextInt();
            chislo = chislo2;
        }
        if (chislo == random2) {
            System.out.println("Вы угадали");
        } else if (chislo == 0) {
            System.out.println("выход из программы");
        }

    }
}
