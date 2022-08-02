package io.devmartynov.tmsAn10Java.l7.part1;
/*
    Task #1
    Класс Phone.
    Создайте класс Phone, который содержит переменные number, model и weight. Создайте три экземпляра этого
    класса. Выведите на консоль значения их переменных.
    Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль
    сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из
    объектов.
    Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
    переменных класса - number, model и weight.
    Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
    number, model.
    Добавить конструктор без параметров.
    Вызвать из конструктора с тремя параметрами конструктор с двумя.
    Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер
    телефона звонящего.
    Вызвать этот метод.
    Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера
    телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
 */
public class Index {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.setNumber(55555);
        phone1.setWeight(411);
        phone1.setModel("s5");
        System.out.println(phone1.getNumber());
        System.out.println(phone1.getWeight());
        System.out.println(phone1.getModel());

        phone2.setNumber(66666);
        phone2.setWeight(350);
        phone2.setModel("s6");
        System.out.println(phone2.getNumber());
        System.out.println(phone2.getWeight());
        System.out.println(phone2.getModel());

        phone3.setNumber(77777);
        phone3.setWeight(310);
        phone3.setModel("s7");
        System.out.println(phone3.getNumber());
        System.out.println(phone3.getWeight());
        System.out.println(phone3.getModel());

        phone1.receiveCall("Dan");
        phone2.receiveCall("Anton");
        phone3.receiveCall("Mihail");

        Phone phone4 = new Phone(22222, 313, "s13");
        Phone phone5 = new Phone(22222, "s13");
        phone5.setWeight(300);
        Phone phone6 = new Phone();
        phone6.setNumber(66666);
        phone6.setWeight(400);
        phone6.setModel("s10");

        phone1.receiveCall("Dan", 22906);
        phone2.receiveCall("Anton", 36906);
        phone2.receiveCall("Sergey", 21278);

        phone1.sendMessage(22906, 36906, 21278);
    }
}
