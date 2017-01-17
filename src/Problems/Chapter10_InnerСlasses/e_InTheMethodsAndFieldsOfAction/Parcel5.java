package Problems.Chapter10_InnerСlasses.e_InTheMethodsAndFieldsOfAction;

import Problems.Chapter10_InnerСlasses.d_InnerClassesAndUpcast.Destination;

/**
 * Created by SashaKhyzhun on 1/17/17. Page 296
 * Внутренние классы в методах и областях действий
 * Этот пример демонстрирует создание всего класса в области действия метода
 * (вместо области действия другого класса). Такая конструкция называется
 * `локальным внутренним классом`.
 */

// Вложение класса в метод.
public class Parcel5 {

    public Destination destination(String s) {

        class PrivateDestination implements Destination {
            private String label;
            private PrivateDestination(String whereTo) { label = whereTo; }
            public String readLabel() { return label; }
        }

        return new PrivateDestination(s);
    }


    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Canada");
    }

}
