package Problems.Chapter17_DetailsAboutContainers.e_UnsupportedOperations;

import Problems.Chapter16_Arrays.f_CreatingTestData.CountingGenerator;

import java.util.*;

/**
 * @author SashaKhyzhun on 5/15/17. Page 655.
 * Неподдерживаемые операции.
 *
 * Самая частая причина неподдерживаемых операций — контейнеры, работающие на базе
 * структуры данных с фиксированным размером. Такие контейнеры создаются в результате
 * преобразования массива в List методом Arrays.asList(). Также можно заставить любой
 * контейнер (включая Мар) выдавать исключения unsupportedOperationException посредством
 * использования немодифицирующих» методов класса Collections.
 * В этом примере представлены оба случая:
 */
public class Unsupported {

    static void test(String msg, List<String> list) {
        System.out.println("--- " + msg + " ---");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1, 8);

        // Копирование подсписки:
        Collection<String> c2 = new ArrayList<String>(subList);
        try {
            c.retainAll(c2);
            System.out.println("retainAll(): " + "vse ok");
        } catch (Exception e) {
            System.out.println("retainAll(): " + e);
        }

        try {
            c.removeAll(c2);
            System.out.println("removeAll(): " + "vse ok");
        } catch (Exception e) {
            System.out.println("removeAll(): " + e);
        }

        try {
            c.clear();
            System.out.println("clear(): " + "vse ok");
        } catch (Exception e) {
            System.out.println("clear(): " + e);
        }

        try {
            c.add("X");
            System.out.println("add(): " + "vse ok");
        } catch (Exception e) {
            System.out.println("add(): " + e);
        }

        try {
            c.addAll(c2);
            System.out.println("addAll(): " + "vse ok");
        } catch (Exception e) {
            System.out.println("addAll(): " + e);
        }

        try {
            c.remove("C");
            System.out.println("remove(): " + "vse ok");
        } catch (Exception e) {
            System.out.println("remove(): " + e);
        }

        // Метод List.set() изменяет значение, но
        // не изменяет размер структуры данных:
        try {
            list.set(0, "X");
            System.out.println("List.set(): " + "vse ok");
        } catch (Exception e) {
            System.out.println("List.set(): " + e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L M N O P".split(" "));

        test("Modifiable Copy", new ArrayList<String>(list));
        test("Arrays.asList()", list);
        test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<String>(list)));

    }


}
