package Problems.Chapter15_Generics.e_GenericMethods;

import java.util.*;

/**
 * @author SashaKhyzhun on 3/13/17. Page 514
 * Упрощенное создание обобщенных контейнеров за счет использования
 * автоматического определения аргументов-типов.
 */
public class New {

    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }

    public static <T> LinkedList<T> lList() {
        return new LinkedList<T>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }

    // Примеры:
    public static void main(String[] args) {
        Map<String, List<String>> sls = New.map();

        List<String> ls = New.lList();

        LinkedList<String> lls = New.lList();

        Set<String> ss = New.set();

        Queue<String> qs = New.queue();
    }

}
