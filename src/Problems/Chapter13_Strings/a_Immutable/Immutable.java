package Problems.Chapter13_Strings.a_Immutable;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 414.
 * Объекты класса String постоянны (immutable). Посмотрев документацию класса String
 * в JDK, вы удивитесь, что каждый метод класса, который на первый взгляд изменяется
 * String, в действительности создает и возвращает новый объект String с включенными
 * измеенениями. Исходный объект String при этом не модифицируется.
 */
public class Immutable {

    public static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "qwerty";
        System.out.println(q); // qwerty

        String qq = upcase(q); // QWERTY
        System.out.println(q); // qwerty
    }

}
