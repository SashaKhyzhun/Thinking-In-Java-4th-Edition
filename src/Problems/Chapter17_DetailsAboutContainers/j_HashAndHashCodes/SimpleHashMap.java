package Problems.Chapter17_DetailsAboutContainers.j_HashAndHashCodes;

import Problems.Chapter17_DetailsAboutContainers.c_Abstract.Countries;

import java.util.*;

/**
 * @author SashaKhyzhun on 5/18/17. Page 681.
 * Демонстрация карты с хешированием.
 */
public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

    // В качестве размера хеш-таблицы следует выбирать простое
    // число, чтобы обеспечить равномерность распределения.
    static final int SIZE = 997;
    // Физический массив обобщений создать нельзя, но
    // можно прийти к нему через восходящее преобразование:
    @SuppressWarnings("unchecked")
    LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];

    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<MapEntry<K, V>>();
        }

        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
        boolean found = false;

        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair);
                found = true;
                break;
            }
        }

        if (!found) {
            buckets[index].add(pair);
        }
        return oldValue;
    }

    public V get(Object key) {
        int index = Math.abs(key.hashCode()) % SIZE;
        if (buckets[index] == null) return null;

        for (MapEntry<K, V> iPair : buckets[index]) {
            if (iPair.getKey().equals(key)) {
                return iPair.getValue();
            }
        }
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
        for (LinkedList<MapEntry<K, V>> bucket : buckets) {
            if (bucket == null) return null;
            for (MapEntry<K, V> mPait : bucket) {
                set.add(mPait);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        SimpleHashMap<String, String> m = new SimpleHashMap<>();
        m.putAll(Countries.capitals(25));

        System.out.println(m);
        System.out.println(m.get("ERITREA"));
        System.out.println(m.entrySet());

    }

}
