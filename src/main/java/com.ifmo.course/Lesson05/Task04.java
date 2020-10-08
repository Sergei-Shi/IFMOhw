package com.ifmo.course.Lesson05;

public class Task04 {
    public static void main(String[] args) {
        //Заменить все буквы в слове на строчные, а первую букву на заглавную
        //Например, дано hello, получаем Hello / дано HeLLO, получаем Hello
        String str1 = "hello";
        String str2 = "HeLLO";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        System.out.println(str1);
        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);
        System.out.println(str2);

    }
}
