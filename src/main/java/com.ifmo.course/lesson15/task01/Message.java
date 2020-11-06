package com.ifmo.course.lesson15.task01;

import java.lang.reflect.Array;
import java.util.*;

enum MessagePriority { // уровень важности сообщения
    LOW, MEDIUM, HIGH, URGENT;
    public static MessagePriority getPriority(int ord){ // метод. выдаст элемент энума по индексу
        for (MessagePriority mp: values()){ // для каждого элемента "mp" типа данных "MessagePriority":
                                            //: из массива, состоящего из значений энумов ("values()" вернет массив, состоящий из энумов)
            if (ord == mp.ordinal()) {      // если, принимаемая в методе цифра "ord" = индексу элемента "mp" массива значений энумов (mp.ordinal() - вернет индекс элемента массива)
                return mp;                  // то вернется элемент "mp" типа данных "MessagePriority"
                                            // и метод закончит работу
            }
        }                                   // если равенство "ord == mp.ordinal()" не выполнится,
                                            // то выбросится ошибка с текстом, что номер не правильно введен ("Wrong ordinal: ")
        throw new AssertionError("Wrong ordinal: " + ord);
    }
}

public class Message implements Comparable<Message>{ // сообщение //implements Comparable<Message>
    private int code; // свойство (номер сообщения)
    private  MessagePriority priority; // свойство (уровень важности сообщения) из перечисления (LOW, MEDIUM, HIGH, URGENT)

    public Message(int code, MessagePriority priority) { // конструктор. принимает оба свойства
        this.code = code;
        this.priority = priority;
    }

    public int getCode() { //геттер. выдаст номер сообщения
        return code;
    }

    public void setCode(int code) { //сеттер. через него можно задать сообщению новый номер
        this.code = code;
    }

    public MessagePriority getPriority() {
        return priority;
    }

    public void setPriority(MessagePriority priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (code != message.code) return false;
        return priority == message.priority;
    }

    @Override
    public int hashCode() {
        int result = code;
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", priority=" + priority +
                '}';
    }

    public static void main(String[] args) {
        // List<Message> messages = MessageGenerator.generate(34);//34
        // System.out.println(messages);
    }

    @Override// для решения 4 задачи. Для сортировки TreeSet нужен компаратор
    public int compareTo(Message o) {
//        if (this.getCode() == o.getCode()){
//            return 0;
//        } else if(this.getCode() < o.getCode()){
//            return -1;
//        } else {
//            return 1;
//        }
        return Integer.compare(this.getCode(), o.getCode()); // тоже, что и код, скрытый выше // -1, 0, 1
    }
}

class MessageGenerator { //генератор сообщений
    public static List<Message> generate(int num){ //метод. принимает число
        if (num <= 0) {
            return Collections.emptyList(); //TODO::выдаст пустой список (неизменяемый). возвращать null это плохо.
                                            // Поэтому лучше вернуть пустю immutable коллекию чем просто null.
                                            // Это способствует уменьшению возникновения таких эксепшенов как NullPointerException
                                            // http://www.quizful.net/interview/java/collections-empty-methods
        }

        Random random = new Random();//создан объект "random" для генерации случайных чисел
        List<Message> messages = new ArrayList<>(num);// создается коллекция с изначальной емкостью размером "num"

//        values() - вернет массив констант
        int typesCount = MessagePriority.values().length;// длина массива из элементов энума "MessagePriority" // длина - 4 (LOW-1, MEDIUM-2, HIGH-3, URGENT-4)

        for (int i = 0; i < num; i++){ // цикл. добавляет в коллекцию "messages" новые объекты "Message"
            messages.add(new Message(random.nextInt(10), MessagePriority.getPriority(random.nextInt(typesCount))));
            //"random.nextInt(10)" генерирует случайное число от 0 до 9 (0,1,2,...,9)
            //"random.nextInt(typesCount)" генерирует случайное число от 0 до 3, т.к. typesCount = 4 (0,1,2,3)
            // nextInt возвращает случайное значение int от 0 (включительно) до указанного предела (не включая)
        }

        return messages;
    }
}
