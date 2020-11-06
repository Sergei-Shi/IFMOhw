package com.ifmo.course.lesson15.task01;

import java.util.*;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO: 1) Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль

        HashMap<MessagePriority, Integer> map1 = new HashMap<>(); // "MessagePriority" - тип приоритета (LOW, MEDIUM, HIGH, URGENT),
                                                                   // "Integer" - кол-во совпадений по данному приоритету
        /*int countLow = 0;
        int countMedium = 0;
        int countHight = 0;
        int countUrgent = 0;
        for (int i = 0; i < messageList.size(); i++) {
            if (messageList.get(i).getPriority() == MessagePriority.LOW) {
                // беру значение "Priority" (LOW, MEDIUM, HIGH, URGENT) из каждого элемента ArrayList, который пришел в параметр данного методa
                // и сравниваю на совпадение с приоритетом "LOW"
                // если совпадет, то countLow увеличиваю на 1
                countLow = countLow + 1;
            }
            if (messageList.get(i).getPriority() == MessagePriority.MEDIUM) {
                countMedium = countMedium + 1;
            }
            if (messageList.get(i).getPriority() == MessagePriority.HIGH) {
                countHight = countHight + 1;
            }
            if (messageList.get(i).getPriority() == MessagePriority.URGENT) {
                countUrgent = countUrgent + 1;
            }
        }
        map1.put(MessagePriority.LOW, countLow);
        map1.put(MessagePriority.MEDIUM, countMedium);
        map1.put(MessagePriority.HIGH, countHight);
        map1.put(MessagePriority.URGENT, countUrgent);
        System.out.println("количество сообщений для LOW - " + map1.get(MessagePriority.LOW));
        System.out.println("количество сообщений для MEDIUM - " + map1.get(MessagePriority.MEDIUM));
        System.out.println("количество сообщений для HIGH - " + map1.get(MessagePriority.HIGH));
        System.out.println("количество сообщений для URGENT - " + map1.get(MessagePriority.URGENT));*/
        for (Message mmm: messageList) { // перебор каждого сообщения (элемента "messageList")
            Integer priorCount = map1.get(mmm.getPriority()); // создал счетчик совпадений приоритета.
                                                                // Изначально счетчик пустой ("map1.get(mmm.getPriority())" даст null),
                                                                // т.к. изначально map1 пустая.
            if(priorCount == null)
                map1.put(mmm.getPriority(), 1);
            else
                map1.put(mmm.getPriority(), priorCount + 1);
        }
        for (Map.Entry<MessagePriority, Integer> sss: map1.entrySet()) {
            System.out.println("количество сообщений для приоритета " + sss.getKey() + "-" + sss.getValue());
        }
    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: 2) Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        HashMap<Integer, Integer> map = new HashMap<>(); // первый "Integer" - код собщения
                                                         // второй "Integer" - кол-во совпадений по данному коду
        for (Message message: messageList) {
            Integer codeCount = map.get(message.getCode());
            if (codeCount == null)
                map.put(message.getCode(), 1);
            else
                map.put(message.getCode(), codeCount + 1);
        }
        for (Map.Entry<Integer, Integer> pair: map.entrySet()) {
            System.out.println("количество сообщений для кода " + pair.getKey() + "- " + pair.getValue());
        }
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: 3) Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        HashSet<Message> hs = new HashSet<Message>(messageList); // HashSet - может принять ArrayList и оставит только уникальные элементы
        System.out.println("количество уникальных сообщений - " + hs.size()); // hs.size() - даст размер hs, что = количество уникальных сообщений
    }

    public static Collection<Message> uniqueMessagesInOriginalOrder(List<Message> messageList){// поменял List на Collection чтобы метод мог выдать TreeSet
        // TODO: 4) вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        HashMap<Message, Integer> map1 = new HashMap<>(); // оздаю "мар" и записываю в нее "Message" и кол-во их повторений
        for (Message mmm: messageList) { // перебор каждого сообщения (элемента "messageList")
            Integer messageCount = map1.get(mmm);
            if(messageCount == null)
                map1.put(mmm, 1);
            else
                map1.put(mmm, messageCount + 1);
        }
        //System.out.println(map1);
        List<Message> messagesSort = new ArrayList<>(); // создаю новую коллекцию из объктов "Message"
        for (Message jjj: messageList) { // перебираю первую коллекцию (messageList)
            if (map1.get(jjj) == 1) // если в "мар" по данному элементу "1", то записываю его в новую коллекцию (messagesSort)
                messagesSort.add(jjj);
        }
        return messagesSort;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority){
        // TODO: 5) удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println("до удаления " + priority + ":" + "\n" + messageList);
        ListIterator<Message> it = messageList.listIterator();
            while (it.hasNext()){ // тут итератор проверяет есть ли следующий элемент в "messageList"
                if (it.next().getPriority() == priority){ // тут итератор сравнивает св-во эл-та с введенным
                    it.remove(); // тут итератор удаляет эл-т в случае совпадения
                }
            }
        System.out.println("после удаления " + priority + ":" + "\n" + messageList);
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority){
        // TODO: 6) удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println("до удаления НЕсовпадений с " + priority + ":" + "\n" + messageList);
        ListIterator<Message> it = messageList.listIterator();
        while (it.hasNext()){ // тут итератор проверяет есть ли следующий элемент в "messageList"
            if (!(it.next().getPriority() == priority)){ // тут итератор сравнивает св-во эл-та с введенным на несовпадение "!"
                it.remove(); // тут итератор удаляет эл-т в случае несовпадения
            }
        }
        System.out.println("после удаления НЕсовпадений с " + priority + ":" + "\n" + messageList);
    }

    public static void main(String[] args) {
        // вызов методов
        List<Message> messages = MessageGenerator.generate(34);
        System.out.println(messages);
        //1)
        //countEachPriority(messages);
        //2)
        //countEachCode(messages);
        //3)
        //uniqueMessageCount(messages);
        //4)
        //System.out.println(uniqueMessagesInOriginalOrder(messages));
        //5)
        //removeEach(messages, MessagePriority.LOW);
        //6)
        //removeOther(messages, MessagePriority.LOW);
    }
}





