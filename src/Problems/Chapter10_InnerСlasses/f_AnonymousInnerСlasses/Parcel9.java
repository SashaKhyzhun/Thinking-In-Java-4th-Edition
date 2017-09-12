package Problems.Chapter10_InnerСlasses.f_AnonymousInnerСlasses;

import Problems.Chapter10_InnerСlasses.d_InnerClassesAndUpcast.Destination;

/**
 * Created by SashaKhyzhun on 1/18/17. Page 299.
 * Анонимный внутренний класс, выполняющий инициализацию
 * (сокращенная версия Parcel5.java)
 */

public class Parcel9 {
    // Для использования в анонимном внутреннем классе
    // аргумент должен быть объявлен как final;
    // TO DO: 1/18/17 хер знает почему, но на 8 java это похер
    public Destination getDestination(String dest) {
        return new Destination() {
            private String label = dest;
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.getDestination("Canada");
        System.out.println(d.readLabel());
    }
}
