package Problems.Chapter9_Interfaces.g_FieldsInInterfaces;

/**
 * Created by SashaKhyzhun on 1/13/17. Страница 281
 * До выхода Java SE5 только так можно было имитировать перечисляемый
 * тип enum из языков C и C++. Это выглядело примерно так:
 */

// Использованине интерфейсов для создания групп констант.

public interface Months {
    int
        JANUARY = 1, FEBRUARY = 2, MARCH = 3,
        APRIL = 4, MAY = 5, JUNE = 6, JULY = 7,
        AUGUST = 8, SEPTEMBER = 9, OCTOBER = 10,
        NOVEMBER = 11, DECEMBER = 12;

}   ///:~
