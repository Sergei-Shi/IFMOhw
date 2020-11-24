package com.ifmo.course.Lesson22;

import java.util.function.*;

public class Task01 {
    public static void main(String[] args) {
        // 1. Отработать написание лямбда (написать по 2 реализации)
        // для: Predicate, Function, UnaryOperator, BinaryOperator, Consumer

        // Predicate<T>: boolean test(T t);
        // у интерфейса "Predicate" есть метод "test" для проверки на соответствие условию.
        // принимает на вход что угодно. вернет true/false
        // реализации метода test:
        // 1. принимает на вход Integer и возвращает true, если число не равно нулю
        Predicate<Integer> noNull = x -> x!=0;
        System.out.println(noNull.test(0));
        // 2. принимает на вход String и возвращает true, если текст равен "Sport"
        Predicate<String> sStart = x -> x == "Sport";
        System.out.println(sStart.test("Sport"));

        // Function<T, R>: R apply(T t);
        // принимает тип T, вернет тип R (T и R могут быть одинаковыми типами данных)
        // реализации метода apply:
        // 1. принимает на вход Integer и возвращает площадь круга Double
        Function<Integer, Double> krug = x -> 3.14 * x * 2;
        System.out.println(krug.apply(2));
        // 2. принимает на вход String и возвращает кол-во букв Integer
        Function<String, Integer> dlina = x -> x.length();
        System.out.println(dlina.apply("slovo"));

        // UnaryOperator<T>: T apply(T t);
        // принимает и выдает один параметр одного типа
        // реализации метода apply:
        UnaryOperator<Integer> unOp1 = x -> x * x;
        System.out.println(unOp1.apply(2));
        UnaryOperator<String> unOp2 = x -> x + ": длина - " + x.length();
        System.out.println(unOp2.apply("slovo"));

        // BinaryOperator<T>: T apply(T t1, T t1);
        // принимает два параметра одного типа и выдает один параметр того же типа
        // реализации метода apply:
        // 1. принимает на вход два Integer и выдаст результат умножения Integer
        BinaryOperator<Integer> binOp1 = (x, y) -> x * y;
        System.out.println(binOp1.apply(2,5));
        // 2. принимает на вход два String и выдаст результат сравнения
        BinaryOperator<String> binOp2 = (x, y) -> String.valueOf(x.compareToIgnoreCase(y));
        System.out.println(binOp2.apply("sraVn", "sravni"));

        //Consumer<T>: void accept(T t);
        // принимает на вход что-угодно. ничего не вернет
        // реализации метода accept:
        // 1. принимает на вход Integer и в консоль
        Consumer<Integer> cons1 = x -> System.out.println(x);
        cons1.accept(5);
        // 2. принимает на вход String и в консоль, предварительно приводя буквы к нижнему регистру
        Consumer<String> cons2 = x -> System.out.println(x.toLowerCase());
        cons2.accept("pRiveT HHt");



    }
}
