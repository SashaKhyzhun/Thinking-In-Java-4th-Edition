package Problems.Chapter17_DetailsAboutContainers.j_HashAndHashCodes;

import Problems.Chapter17_DetailsAboutContainers.c_Abstract.Countries;

import java.util.*;

/**
 * @author SashaKhyzhun on 5/18/17. Page 678.
 * Реализация Map на базе списков ArrayList.
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {

    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    public V put(K key, V value) {
        V oldValue = get(key); // Старое значение или null
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(keys.indexOf(key), value);
        }
        return oldValue;
    }

    // key относится к типу Object, не К
    public V get(Object key) {
        if (!keys.contains(key)) {
            return null;
        }
        return values.get(keys.indexOf(key));
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<Entry<K, V>>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while (ki.hasNext()) {
             set.add(new MapEntry<K, V>(ki.next(), vi.next()));
        }
        return set;
    }


    public static void main(String[] args) {
        SlowMap<String, String> m = new SlowMap<>();
        m.putAll(Countries.capitals(25));
        System.out.println(m);
        System.out.println(m.get("BULGARIA"));
        System.out.println(m.entrySet());
    }

}
