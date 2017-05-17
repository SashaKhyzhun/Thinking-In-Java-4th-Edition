package Problems.Chapter17_DetailsAboutContainers.g_SetAndSortOrder;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author SashaKhyzhun on 5/17/17. Page 661.
 * Theme: Set и порядок хранения
 * Методы необходимие для хранения типа в Set.
 *
 *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Название класса / интерф. *                          Описание                                   *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Set (интерфейст           * Каждый элемент, добавляемый в множесто Set, должен быть уникальным; *
 *                           * в противном случае дубликат не добавляется. Все объекты помещаемые  *
 *                           * в Set, должны определять метод equals() для выполнения сравнения.   *
 *                           * Интерфейс Set полностью идентичен интерфейсу Collection. Множество  *
 *                           * Set не гарантирует того, что хранимые в нем элементы будут          *
 *                           * располагатся в определенном порядке.                                *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * HashSet"                  * Для реализаций Set, у который первостепенное значение имеет быстрый *
 *                           * поиск. Хранимые объекты должны определять метод hashCode()          *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * TreeSet                   * Упорядоченное множество, реализованное на основе дерева. Из него    *
 *                           * можно извлекать упорядоченную последовательность элементов.         *
 *                           * Элементы также должны реализовать интерфейс Comparable              *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * LinkedHashSet             * Обладает аналогичной HashSet скоростью поиска, а также своими       *
 *                           * силами (используя связанный поиск) запоминает порядок добавления    *
 *                           * элементов (порядок вставки). Таким образом, при переборе элементов  *
 *                           * этого множества они следуют в порядке вставки. Элементы такоже      *
 *                           * должны определять hashCode()                                        *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 *
 * Звездочка рядом с HashSet указывает, что при отсутствии других ограничений
 * следует выбирать именно этот вариант, потому что он оптимизирован по скорости.
 */

class SetType {
    int i;

    public SetType(int n) {
        this.i = n;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SetType && (i == ((SetType)obj).i);
    }

    @Override
    public String toString() {
        return Integer.toString(i);
    }

}

class HashType extends SetType {

    public HashType(int n) {
        super(n);
    }

    @Override
    public int hashCode() {
        return i;
    }
}

class TreeType extends SetType implements Comparable<TreeType> {

    public TreeType(int n) {
        super(n);
    }

    @Override
    public int compareTo(TreeType arg) {
        return (arg.i < i ? -1 : (arg.i == i ? 0 : 1)); // omg, this is switch;
    }
}

public class TypesForSets {

    static <T> Set<T> fill(Set<T> set, Class<T> type) {
        try {
            for (int i = 0; i < 10; i++)
                set.add(type.getConstructor(int.class).newInstance(i));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return set;
    }

    static <T> void test(Set<T> set, Class<T> type) {
        fill(set, type);
        fill(set, type); // Попытка добавления дубликатов
        fill(set, type);
        System.out.println(set);
    }

    public static void main(String[] args) {
        System.out.print("HashSet<HashType>:       ");
        test(new HashSet<HashType>(), HashType.class); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.print("LinkedHashSet<HashType>: ");
        test(new LinkedHashSet<HashType>(), HashType.class);

        System.out.print("TreeSet<TreeType>:       ");
        test(new TreeSet<TreeType>(), TreeType.class);

        // следующие операции не работают:
        System.out.print("HashSet<SetType>:        ");
        test(new HashSet<SetType>(), SetType.class);
        System.out.print("HashSet<TreeType>:       ");
        test(new HashSet<TreeType>(), TreeType.class);

        System.out.print("LinkedHashSet<SetType>:  ");
        test(new LinkedHashSet<SetType>(), SetType.class);
        System.out.print("LinkedHashSet<TreeType>: ");
        test(new LinkedHashSet<TreeType>(), TreeType.class);


        System.out.println("");
        try {
            System.out.print("TreeSet<SetType>:    ");
            test(new TreeSet<SetType>(), SetType.class);
        } catch (Exception e) { System.out.println(e.getMessage()); }

        try {
            System.out.print("TreeSet<HashType>:   ");
            test(new TreeSet<HashType>(), HashType.class);
        } catch (Exception e) { System.out.println(e.getMessage()); }
    }

}
