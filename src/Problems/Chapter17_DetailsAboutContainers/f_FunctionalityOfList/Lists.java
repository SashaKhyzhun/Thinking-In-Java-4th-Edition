package Problems.Chapter17_DetailsAboutContainers.f_FunctionalityOfList;

import Problems.Chapter17_DetailsAboutContainers.c_Abstract.Countries;

import java.util.*;

/**
 * @author SashaKhyzhun on 5/15/17. Page 656.
 * Функциональность List.
 *
 * На самом деле есть два типа списков: основной arrayList, который
 * особенно хорош при извлечении произвольных элементов из контейнера,
 *
 * и гораздо более мощный список LinkedList (который не разрабатывался
 * для быстрого доступа к произвольным элементам, но зато он обладает
 * более полным набором методов).
 *
 * Методы следующего примера охватывают совокупность различных видов
 * действий: то, что может каждый список (метод bаiсTеst()), перемещение
 * по списку посредством итератора (iterMotion()) в сравнении с изменением
 * списка с помощью итератора (iterManipulation()), просмотр результатов операций
 * со списками (testVisual()) и операции, доступные только в классе LinkedList.
 */
public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    // базовые операции присутствующие в обох списках
    public static void basicTest(List<String> list) {
        list.add(1, "x"); // добавление в позиции 1
        list.add("X"); // добавление в конец
        list.addAll(Countries.names(25)); // добавление колекции с позиции 3.

        b = list.contains("1"); // значение присутствует?
        b = list.containsAll(Countries.names(25)); // вся коллеция?

        // Списки обеспечивают произвольный доступ -
        // быстрый для ArrayList, медленный для LinkedList:
        s = list.get(1);       // получение (типизованного) объекта в позиции 1
        i = list.indexOf("1"); // получение индекса объекта
        b = list.isEmpty();    // список содержит элементы?
        it = list.iterator();  // обычный Iterator

        lit = list.listIterator();         // ListIterator
        lit = list.listIterator(3); // Начать с позиции 3
        i = list.lastIndexOf("1");     // Последнее вхождение

        list.remove(1); // Удаление в позиции 1
        list.remove("3");  // Удаление заданного объекта
        list.set(1, "y");     // записать "у" в позицию 1

        list.removeAll(Countries.names(25)); // Оставь все элементы, присутствующих в аргументе
        list.removeAll(Countries.names(25)); // Удаление всех элементов, присутствующих в аргументе

        i = list.size(); // Определение размера
        list.clear();    // Удаление всех элементов
    }

    // перемещение по списку посредством итератора
    public static void iterMotion(List<String> list) {
        ListIterator<String> it = list.listIterator();
        b = it.hasNext();
        b = it.hasPrevious();
        s = it.next();
        s = it.previous();
        i = it.nextIndex();
        i = it.previousIndex();
    }

    // в сравнении с изменением списка с помощью итератора
    public static void iterManipulation(List<String> list) {
        ListIterator<String> it = list.listIterator();
        it.add("47");
        // Переход к элементу после add():
        it.next();
        // Удаление элемента за вновь созданным:
        it.remove();
        // Переход к элементу после remove():
        it.next();
        // Изменение элемента после удаленного:
        it.set("47");
    }

    // просмотр результатов операций со списками
    public static void testVisual(List<String> a) {
        System.out.println("a = " + a);
        List<String> b = Countries.names(25);
        System.out.println("b = " + b);
        a.addAll(b);
        a.addAll(b);
        System.out.println("a =+ b, b: " + a);

        // Вставка, удаление и замена элементов с использованием ListIterator:
        ListIterator<String> x = a.listIterator(a.size() / 2);
        x.add("one");
        System.out.println(x);
        System.out.println(x.next());
        x.remove();
        System.out.println(x.next());
        x.set("47");
        System.out.println(x);

        // Перебор списка в обратном направлении:
        x = a.listIterator(a.size());
        while (x.hasPrevious())
            System.out.print(x.previous() + " ");
        System.out.println("");
        System.out.println("testVisual finished");
    }

    // операции, доступные только в классе LinkedList.
    public static void testLinkedList() {
        LinkedList<String> ll = new LinkedList<>();
        ll.addAll(Countries.names(25));
        System.out.println(ll);

        // Интерпретировать как стек - занесение:
        ll.addFirst("one");
        ll.addFirst("two");
        System.out.println(ll);

        // Аналог чтения с вершины стека (без извлечения):
        System.out.println(ll.getFirst());
        // Аналог извлечения из стека:
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());


        // Интерпретировать как очередь с извлечениеи элементов с конца:
        System.out.println(ll.removeLast());
        System.out.println(ll);
    }


    private static void exerciseAfterSubChapter(List<String> list) {
        //1: create 2 lists and fill it with Countries.name(25). Show it with simple iterator.
        System.out.println("1) create 2 lists and fill it with Countries.name(25). Show it with simple iterator:");
        it = list.iterator();
        System.out.print("our list == ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("");

        //2: add first list into second with ListIterator and with using inserting over position.

        System.out.println("================================================");
        System.out.println("2) Adding elements with ListIterator from position 5:");
        ArrayList<String> list2 = new ArrayList<>(Countries.names(25));
        ListIterator<String> x = list.listIterator(list2.size() / 2); // check it again.
        while (x.hasNext()) {
            list2.add(x.next());
        }
        System.out.println("list2 from position 5: " + list2);

        System.out.println("================================================");
        System.out.println("Adding elements with ListIterator from the end to begin:");
        list2.clear();
        x = list.listIterator(list.size());
        while (x.hasPrevious()) {
            list2.add(x.previous());
        }
        System.out.println("list2 after add(x.previous(): " + list2);
    }

    public static void main(String[] args) {
        // Каждый раз создается и заполняется новый список:
        basicTest(new LinkedList<String>(Countries.names(25)));
        basicTest(new ArrayList<String>(Countries.names(25)));

        iterMotion(new LinkedList<String>(Countries.names(25)));
        iterMotion(new ArrayList<String>(Countries.names(25)));

        iterManipulation(new LinkedList<String>(Countries.names(25)));
        iterManipulation(new ArrayList<String>(Countries.names(25)));

        testVisual(new LinkedList<String>(Countries.names(25)));
        testLinkedList();

        System.out.println("--------------- Exercise After SubChapter ----------------");
        exerciseAfterSubChapter(new ArrayList<>(Countries.names(25)));
        exerciseAfterSubChapter(new LinkedList<>(Countries.names(25)));

    }



}
