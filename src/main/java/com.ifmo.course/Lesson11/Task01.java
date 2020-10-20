package com.ifmo.course.Lesson11;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    /* 1. Задача
         Дано
     1.  enum должностей Position,
     2.  класс User со следующими полями:
         String fulName;
         int salary;
         Position position;
     3.  несколько массивов, в каждом массиве будут храниться объекты класса User с одинаковыми должностями
         Пользователь вводит свои имя, фамилию и первую букву должности.
         Ваша задача создать объект типа User и поместить его в соответствующий массив.*/
    public static void main(String[] args) {
        User[] directora = new User[5];
        User[] uborshiki = new User[5];
        User[] vrachi = new User[5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("введите свои данные (Имя Фамилию и первую букву должности). например: Ivan Petrov d");
        String svedenija = scanner.nextLine();

        //String svedenija = "Ivan Petrov d";
        String[] svedenijaArr  = svedenija.split(" ");

        String name = svedenijaArr[0] + svedenijaArr[1];
        int zp = (int) (Math.random() * (100 - 10) + 10);

        User user = new User(name, zp);

        String pos = svedenijaArr[2];
        switch (pos){
            case "d":
                for (int i = 0; i < directora.length; i++) {
                    if (directora[i] == null) {
                        directora[i] = user;
                    }
                }
                break;
            case "u":
                for (int i = 0; i < uborshiki.length; i++) {
                    if (uborshiki[i] == null) {
                        uborshiki[i] = user;
                    }
                }
                break;
            case "v":
                for (int i = 0; i < vrachi.length; i++) {
                    if (vrachi[i] == null) {
                        vrachi[i] = user;
                    }
                }
                break;
            default:
        }

    }
}
    class User {
    private String fulName;
    private int salary;
    private Position position;

        public User(String fulName, int salary) {
            this.fulName = fulName;
            this.salary = salary;

        }

        public String getFulName() {
            return fulName;
        }

        public void setFulName(String fulName) {
            this.fulName = fulName;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public Position getPosition() {
            return position;
        }

        public void setPosition(Position position) {
            this.position = position;
        }
    }

    enum Position {
         DIRECTOR, UBORCHIK, VRACH;
    }




