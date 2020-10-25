package com.ifmo.course.Lesson12;


import java.util.Arrays;


public class Task02 {
    /*Создать массив исключений и заполнить его 9 различными runtime исключениями. Например,

            try {
        int[] arr = new int[5];
        arr[7] = 12;
    } catch (Exception e) {
        exepArr[0] = e;
    }
    и тд*/

    public static void main(String[] args) {
        Exception[] exepArr = new Exception[9];
        //1. ArrayIndexOutOfBoundsException Индекс массива выходит за пределы поля.
        try {
            int[] arr = new int[5];
            arr[7] = 12;
        } catch (ArrayIndexOutOfBoundsException a){
            exepArr[0] = a;
        }
        //2. ArithmeticException: / by zero Арифметика ошибка, например, деление на ноль.
        try {
            int a = 1 / 0;
        } catch (ArithmeticException a){
            exepArr[1] = a;
        }
        //3. NullPointerException
        try {
            String a = null;
            a.length();
        } catch (NullPointerException a){
            exepArr[2] = a;
        }
        //3. ClassCastException привести объект к классу, экземпляром которого он не является. Недопустимое приведение
        try {
            Object c = Double.valueOf(5);
            String s = (String)c;
        } catch (ClassCastException a){
            exepArr[3] = a;
        }
        //4. IllegalArgumentException - неверный аргумент при вызове метода
        try {
            Enum.valueOf("C");
        } catch (IllegalArgumentException a){
            exepArr[4] = a;
        }

        //System.out.println(Arrays.toString(exepArr));


        }
    enum Enum {
        A, B;
    }






    }


