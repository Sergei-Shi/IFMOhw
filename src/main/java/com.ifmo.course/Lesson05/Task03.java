package com.ifmo.course.Lesson05;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //Написать функцию, которая проверяет, является ли строка палиндромом.
        //Палиндром — это число, буквосочетание, слово или текст,
        // которые одинаково читаются по буквам или по словам как слева направо, так и справа налево.
        //Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром
        Scanner sc = new Scanner(System.in);
        System.out.println("напишите что-нибудь. проверим на палиндром =)");
        String c = sc.nextLine();
        String a = c.replace(" ", "");

        String b = "";
        for (int i = a.length()-1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        System.out.println("Зеркальное написание введенного " + b);
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Вы ввели палиндром");
        } else System.out.println("Вы ввели НЕ палиндром");


    }
}
