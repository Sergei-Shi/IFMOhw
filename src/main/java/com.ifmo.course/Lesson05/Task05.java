package com.ifmo.course.Lesson05;

import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        //Найдите самое длинное слово в предложении,
        // при условии, что в предложении все слова разной длины
        //Например, в "в предложении все слова разной длины" самое длинное слово "предложении"

        String predlozhenie = "в предложении все слова разной длины";
        String[] predlozhenieArr = predlozhenie.split(" ");
        System.out.println(Arrays.toString(predlozhenieArr));

        String dlinnoeSlovo = "a";
        System.out.println(predlozhenieArr[1].length());
        for (int i = 0; i < predlozhenieArr.length; i++) {

            if (predlozhenieArr[i].length() > dlinnoeSlovo.length()) {
                dlinnoeSlovo = predlozhenieArr[i];
            }

        }
        System.out.println("самое длинное слово - " + dlinnoeSlovo);
    }

}
