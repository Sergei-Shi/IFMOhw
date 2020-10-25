package com.ifmo.course.Lesson12;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;


public class Task01 {
    /*Метод static void throwException(Status status) throws JarException, FileNotFoundException, AccessDeniedException
    принимает на вход enum и выбрасывает следующие исключения в зависимости от значения status:
    если status FILE_NOT_FOUND, выбрасывает FileNotFoundException
    если status ACCESS_DENIED, выбрасывает AccessDeniedException
    если status JAR_ERROR, выбрасывает JarException.
    При вызове метода throwException обработать исключения следующим образом:
    FileNotFoundException - выводить в консоль сообщение исключения(метод getMessage()) + любое дополнительное сообщение,
    AccessDeniedException - выводить в консоль сообщение исключения (метод getMessage()) и снова выбрасывать exception,
    JarException - выводить в консоль стек трейс.

    enum Status с необходимыми константами нужно создать.*/

    public static void main(String[] args) {
        throwException(Status.valueOf("JAR_ERROR"));
    }
    static void throwException(Status status) {
        if (status == Status.valueOf("FILE_NOT_FOUND")) {
            try {
                throw new FileNotFoundException("FileNotFoundException");
            } catch (FileNotFoundException e) {
                System.out.println("Message = " + e.getMessage()); //Message = FileNotFoundException
            }
        }
        if (status == Status.valueOf("ACCESS_DENIED")) {
            try {
                throw new AccessDeniedException("AccessDeniedException");
            } catch (AccessDeniedException e) {
                System.out.println("Message = " + e.getMessage()); //Message = AccessDeniedException
                try {
                    throw new AccessDeniedException("и снова выбрoc exception");
                } catch (AccessDeniedException accessDeniedException) {
                    accessDeniedException.printStackTrace();
                }
            }
        }
        if (status == Status.valueOf("JAR_ERROR")) {
            try {
                throw new JarException();
            } catch (JarException e) {
                e.printStackTrace();
            }
        }
    }
}
