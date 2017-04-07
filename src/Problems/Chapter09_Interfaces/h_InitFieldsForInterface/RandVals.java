package Problems.Chapter09_Interfaces.h_InitFieldsForInterface;

import java.util.Random;

/**
 * Created by SashaKhyzhun on 1/13/17. Страница 282
 * Поля, определяемые в интерфейсах, не могут быть "пустыми константами", но
 * могут инициализироваться не-константными выражениями. Например:
 */

// Инициализация полей интерфейсов не-константным выражениями

public interface RandVals {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt(10);
    long RANDOM_LONG = RAND.nextLong() * 10;
    float RANDOM_FLOAT = RAND.nextFloat() * 10;
    double RANDOM_DOUBLE = RAND.nextDouble() * 10;

} ///:~

class TestRandVals {
    public static void main(String[] args) {
        System.out.println(RandVals.RANDOM_INT);
        System.out.println(RandVals.RANDOM_LONG);
        System.out.println(RandVals.RANDOM_FLOAT);
        System.out.println(RandVals.RANDOM_DOUBLE);
    }
}

/**
 * Конечно, поля не являються частью интерфейса. Данные хранятся в
 * статической области памяти, отведенной для данного интерфейса.
 */
