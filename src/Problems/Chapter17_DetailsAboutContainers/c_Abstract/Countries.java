package Problems.Chapter17_DetailsAboutContainers.c_Abstract;

import Problems.Chapter16_Arrays.f_CreatingTestData.CountingGenerator;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author SashaKhyzhun on 5/10/17. Page 643.
 *
 */
public class Countries {

    public static final String[][] DATA = {
            {"ALGERIA", "Algiers"}, {"ANGOLA", "Luanda"},
            {"BENIN", "Porto-Novo"}, {"CAPE VERDE", "Praia"},
            {"ALGERIA2", "Algiers2"}, {"ANGOLA2", "Luanda2"},
            {"BENIN2", "Porto-Novo2"}, {"CAPE VERDE2", "Praia2"},
            {"ALGERIA3", "Algiers3"}, {"ANGOLA3", "Luanda3"},
            {"BENIN3", "Porto-Novo3"}, {"CAPE VERDE3", "Praia3"},
    };


    // Использование AbstractMap реализацией entrySet()
    private static class FlyweightMap extends AbstractMap<String, String> {

        private static class Entry implements Map.Entry<String, String> {
            int index;
            Entry(int index) {
                this.index = index;
            }
            @Override
            public boolean equals(Object obj) {
                return DATA[index][0].equals(obj);
            }
            @Override
            public String getKey() {
                return DATA[index][0];
            }
            @Override
            public String getValue() {
                return DATA[index][1];
            }
            @Override public int hashCode() {
                return DATA[index][0].hashCode();
            }
            public String setValue(String value) {
                throw new UnsupportedOperationException();
            }
        }

        // Использование AbstractSet реализацией size() и iterator()
        static class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            private int size;
            EntrySet(int size) {
                if (size < 0)
                    this.size = 0;
                    // не может быть больше массива:
                else if (size > DATA.length)
                    this.size = DATA.length;
                else
                    this.size = size;
            }
            public int size() {
                return size;
            }

            private class Iter implements Iterator<Map.Entry<String, String>> {
                // Только один объект Entry на Iterator:
                private Entry entry = new Entry(-1);
                @Override
                public boolean hasNext() {
                    return entry.index < size - 1;
                }
                @Override
                public Map.Entry<String, String> next() {
                    entry.index++;
                    return entry;
                }
                public void remove() {
                    throw new UnsupportedOperationException();
                }
                public Iterator<Map.Entry<String, String>> iterator() {
                    return new Iter();
                }
            }

            public Iterator<Map.Entry<String, String>> iterator() {
                return new Iter();
            }
        }

        private static Set<Map.Entry<String, String>> entries = new EntrySet(DATA.length);

        public Set<Map.Entry<String, String>> entrySet() {
            return entries;
        }
    }

    // Создание частичной карты из 'size' стран:
    static Map<String, String> select(final int size) {
        return new FlyweightMap() {
            public Set<Map.Entry<String, String>> entrySet() {
                return new EntrySet(size);
            }
        };
    }

    static Map<String, String> map = new FlyweightMap();
    static Map<String, String> capitals() {
        return map; // Полная карта
    }
    static Map<String, String> capitals(int size) {
        return select(size); // частичная карта
    }
    static List<String> names = new ArrayList<String>(map.keySet());

    // Все имена:
    public static List<String> names() {
        return names;
    }
    // Частичный список:
    public static List<String> names(int size) {
        return new ArrayList<String>(select(size).keySet());
    }

    public static void main(String[] args) {
        System.out.println(capitals(4));
        System.out.println(names(2));

        System.out.println(new HashMap<String, String>(capitals(3)));
        System.out.println(new LinkedHashMap<>(capitals(3)));
        System.out.println(new TreeMap<>(capitals(3)));
        System.out.println(new Hashtable<>(capitals(3)));

        System.out.println(new HashSet<String>(names(3)));
        System.out.println(new LinkedHashSet<String>(names(3)));
        System.out.println(new TreeSet<String>(names(3)));
        System.out.println(new ArrayList<String>(names(3)));
        System.out.println(new LinkedList<String>(names(3)));

        System.out.println(capitals().get("BENIN3"));

    }

}
