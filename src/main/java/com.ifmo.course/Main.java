package com.ifmo.course;

import com.ifmo.course.kontrolnaja01.Abonement;
import com.ifmo.course.kontrolnaja01.Fitness;
import com.ifmo.course.kontrolnaja01.Klient;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите комманду:\n" +
                    "Фитнесс закрыт\nновый клиент\nвывод информации о посетителях");
            String command = scanner.nextLine();
            switch (command){
                case  "Фитнесс закрыт":
                    Arrays.fill(Fitness.trenazerka, null);
                    Arrays.fill(Fitness.bassein, null);
                    Arrays.fill(Fitness.grupZal, null);
                    System.out.println("Фитнесс закрыт");
                    break;
                case "новый клиент":
                    System.out.println("Сообщите ваше имя");
                    String imja = scanner.nextLine();
                    System.out.println("Сообщите вашу фамилию");
                    String familija = scanner.nextLine();
                    System.out.println("Сообщите дату вашего рождения");
                    String dateRozhd = scanner.nextLine();
                    LocalDate date = LocalDate.parse(dateRozhd);

                    System.out.println("Сообщите тип вашего абонемента: разовый/дневной/полный");
                    String tip = scanner.nextLine();

                    System.out.println("Сообщите желаемую зону: зал/бассейн/групповые");
                    String zona = scanner.nextLine();
                    LocalDateTime current;

                    switch (tip){
                        case "разовый":
                            current = LocalDateTime.now();
                            if (current.getHour() < 8 || current.getHour() > 22) {
                                System.out.println("Фитнесс закрыт");
                                break;
                            }
                            switch (zona){
                                case "зал":
                                    for (int i = 0; i < Fitness.trenazerka.length; i++) {
                                        if (Fitness.trenazerka[i] != null) {
                                            if (i == Fitness.trenazerka.length-1) {
                                                System.out.println("мест нет");
                                                break;
                                            }
                                        } else {
                                            Klient klient = new Klient(imja, familija, date);
                                            Abonement abonement = new Abonement(klient);
                                            abonement.registrationStart = current;
                                            abonement.registrationFinish = LocalDateTime.of(LocalDate.of(current.getYear(), current.getMonth(), current.getDayOfMonth()), LocalTime.of(22, 0, 0, 0));
                                            Fitness.trenazerka[i] = abonement;
                                            System.out.println("проходите на занятие");
                                            System.out.println("инфо о клиенте: \n" + familija + "\n" + imja + "\n" + zona + "\n" + "дата начала посещения" + abonement.registrationStart + "\n" + "дата окончания посещения"+ abonement.registrationFinish);
                                            break;
                                        }
                                    }
                                    break;
                                case "бассейн":
                                    for (int i = 0; i < Fitness.bassein.length; i++) {
                                        if (Fitness.bassein[i] != null) {
                                            if (i == Fitness.bassein.length-1) {
                                                System.out.println("мест нет");
                                                break;
                                            }
                                        } else {
                                            Klient klient = new Klient(imja, familija, date);
                                            Abonement abonement = new Abonement(klient);
                                            abonement.registrationStart = current;
                                            abonement.registrationFinish = LocalDateTime.of(LocalDate.of(current.getYear(), current.getMonth(), current.getDayOfMonth()), LocalTime.of(22, 0, 0, 0));
                                            Fitness.bassein[i] = abonement;
                                            System.out.println("проходите на занятие");
                                            System.out.println("инфо о клиенте: \n" + familija + "\n" + imja + "\n" + zona + "\n" + "дата начала посещения" + abonement.registrationStart + "\n" + "дата окончания посещения"+ abonement.registrationFinish);
                                            break;
                                        }
                                    }
                                    break;
                                case "групповые":
                                    System.out.println("такая зона не доступна");
                                    break;
                                default:
                                    System.out.println("Такой зоны нет. Поробуйте заново");

                            }
                            break;

                        case "дневной":
                            current = LocalDateTime.now();
                            if (current.getHour() < 8 || current.getHour() > 16) {
                                System.out.println("Фитнесс закрыт");
                                break;
                            }
                            switch (zona){
                                case "зал":
                                    for (int i = 0; i < Fitness.trenazerka.length; i++) {
                                        if (Fitness.trenazerka[i] != null) {
                                            if (i == Fitness.trenazerka.length-1) {
                                                System.out.println("мест нет");
                                                break;
                                            }
                                        } else {
                                            Klient klient = new Klient(imja, familija, date);
                                            Abonement abonement = new Abonement(klient);
                                            abonement.registrationStart = current;
                                            abonement.registrationFinish = LocalDateTime.of(LocalDate.of(current.getYear(), current.getMonth(), current.getDayOfMonth()), LocalTime.of(16, 0, 0, 0));
                                            Fitness.trenazerka[i] = abonement;
                                            System.out.println("проходите на занятие");
                                            System.out.println("инфо о клиенте: \n" + familija + "\n" + imja + "\n" + zona + "\n" + "дата начала посещения" + abonement.registrationStart + "\n" + "дата окончания посещения"+ abonement.registrationFinish);
                                            break;
                                        }
                                    }
                                    break;
                                case "групповые":
                                    for (int i = 0; i < Fitness.grupZal.length; i++) {
                                        if (Fitness.grupZal[i] != null) {
                                            if (i == Fitness.grupZal.length-1) {
                                                System.out.println("мест нет");
                                                break;
                                            }
                                        } else {
                                            Klient klient = new Klient(imja, familija, date);
                                            Abonement abonement = new Abonement(klient);
                                            abonement.registrationStart = current;
                                            abonement.registrationFinish = LocalDateTime.of(LocalDate.of(current.getYear(), current.getMonth(), current.getDayOfMonth()), LocalTime.of(16, 0, 0, 0));
                                            Fitness.grupZal[i] = abonement;
                                            System.out.println("проходите на занятие");
                                            System.out.println("инфо о клиенте: \n" + familija + "\n" + imja + "\n" + zona + "\n" + "дата начала посещения" + abonement.registrationStart + "\n" + "дата окончания посещения"+ abonement.registrationFinish);
                                            break;
                                        }
                                    }
                                    break;
                                case "бассейн":
                                    System.out.println("такая зона не доступна");
                                    break;
                                default:
                                    System.out.println("Такой зоны нет. Поробуйте заново");

                            }
                            break;

                        case "полный":
                            current = LocalDateTime.now();
                            if (current.getHour() < 8 || current.getHour() > 22) {
                                System.out.println("Фитнесс закрыт");
                                break;
                            }
                            switch (zona){
                                case "зал":
                                    for (int i = 0; i < Fitness.trenazerka.length; i++) {
                                        if (Fitness.trenazerka[i] != null) {
                                            if (i == Fitness.trenazerka.length-1) {
                                                System.out.println("мест нет");
                                                break;
                                            }
                                        } else {
                                            Klient klient = new Klient(imja, familija, date);
                                            Abonement abonement = new Abonement(klient);
                                            abonement.registrationStart = current;
                                            abonement.registrationFinish = LocalDateTime.of(LocalDate.of(current.getYear(), current.getMonth(), current.getDayOfMonth()), LocalTime.of(22, 0, 0, 0));
                                            Fitness.trenazerka[i] = abonement;
                                            System.out.println("проходите на занятие");
                                            System.out.println("инфо о клиенте: \n" + familija + "\n" + imja + "\n" + zona + "\n" + "дата начала посещения" + abonement.registrationStart + "\n" + "дата окончания посещения"+ abonement.registrationFinish);
                                            break;
                                        }
                                    }
                                    break;
                                case "групповые":
                                    for (int i = 0; i < Fitness.grupZal.length; i++) {
                                        if (Fitness.grupZal[i] != null) {
                                            if (i == Fitness.grupZal.length-1) {
                                                System.out.println("мест нет");
                                                break;
                                            }
                                        } else {
                                            Klient klient = new Klient(imja, familija, date);
                                            Abonement abonement = new Abonement(klient);
                                            abonement.registrationStart = current;
                                            abonement.registrationFinish = LocalDateTime.of(LocalDate.of(current.getYear(), current.getMonth(), current.getDayOfMonth()), LocalTime.of(22, 0, 0, 0));
                                            Fitness.grupZal[i] = abonement;
                                            System.out.println("проходите на занятие");
                                            System.out.println("инфо о клиенте: \n" + familija + "\n" + imja + "\n" + zona + "\n" + "дата начала посещения" + abonement.registrationStart + "\n" + "дата окончания посещения"+ abonement.registrationFinish);
                                            break;
                                        }
                                    }
                                    break;
                                case "бассейн":
                                    for (int i = 0; i < Fitness.bassein.length; i++) {
                                        if (Fitness.bassein[i] != null) {
                                            if (i == Fitness.bassein.length-1) {
                                                System.out.println("мест нет");
                                                break;
                                            }
                                        } else {
                                            Klient klient = new Klient(imja, familija, date);
                                            Abonement abonement = new Abonement(klient);
                                            abonement.registrationStart = current;
                                            abonement.registrationFinish = LocalDateTime.of(LocalDate.of(current.getYear(), current.getMonth(), current.getDayOfMonth()), LocalTime.of(22, 0, 0, 0));
                                            Fitness.bassein[i] = abonement;
                                            System.out.println("проходите на занятие");
                                            System.out.println("инфо о клиенте: \n" + familija + "\n" + imja + "\n" + zona + "\n" + "дата начала посещения" + abonement.registrationStart + "\n" + "дата окончания посещения"+ abonement.registrationFinish);
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    System.out.println("Такой зоны нет. Поробуйте заново");
                            }
                            break;
                        default:
                            System.out.println("Такой типа абонемента нет. Поробуйте заново");
                    }
                    break;
                case "вывод информации о посетителях":
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("информация о посетителях:\n тренажерный зал: \n");
                    int count = 0;
                    StringBuilder stringBuilderKlient = new StringBuilder();
                    for (int i = 0; i < Fitness.trenazerka.length; i++) {
                        Abonement abonement = Fitness.trenazerka[i];
                        if (abonement != null) {
                            count++;
                            Klient klient = abonement.klient;
                            stringBuilderKlient.append(klient.surname + "\n" + klient.name + "\n" + "зона: тренажерный зал" + "\n" + "дата начала посещения" + abonement.registrationStart + "\n" + "дата окончания посещения"+ abonement.registrationFinish + "\n\n");
                        }
                    }
                    stringBuilder.append("количество человек:" + count + "\n");
                    stringBuilder.append(stringBuilderKlient.toString());

                    count = 0;
                    stringBuilderKlient = new StringBuilder();
                    stringBuilder.append("бассейн: \n");
                    for (int i = 0; i < Fitness.bassein.length; i++) {
                        Abonement abonement = Fitness.bassein[i];
                        if (abonement != null) {
                            count++;
                            Klient klient = abonement.klient;
                            stringBuilderKlient.append(klient.surname + "\n" + klient.name + "\n" + "зона: бассейн" + "\n" + "дата начала посещения" + abonement.registrationStart + "\n" + "дата окончания посещения"+ abonement.registrationFinish + "\n\n");
                        }
                    }
                    stringBuilder.append("количество человек:" + count + "\n");
                    stringBuilder.append(stringBuilderKlient.toString());

                    count = 0;
                    stringBuilderKlient = new StringBuilder();
                    stringBuilder.append("групповые занятия: \n");
                    for (int i = 0; i < Fitness.grupZal.length; i++) {
                        Abonement abonement = Fitness.grupZal[i];
                        if (abonement != null) {
                            count++;
                            Klient klient = abonement.klient;
                            stringBuilderKlient.append(klient.surname + "\n" + klient.name + "\n" + "зона: групповые занятия" + "\n" + "дата начала посещения" + abonement.registrationStart + "\n" + "дата окончания посещения"+ abonement.registrationFinish + "\n\n");
                        }
                    }
                    stringBuilder.append("количество человек:" + count + "\n");
                    stringBuilder.append(stringBuilderKlient.toString());

                    System.out.println(stringBuilder.toString());

                    break;
                default:
                    System.out.println("введите корректную команду");
            }
        }
    }
}
