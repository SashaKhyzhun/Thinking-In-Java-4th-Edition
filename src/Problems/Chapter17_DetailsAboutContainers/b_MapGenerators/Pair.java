package Problems.Chapter17_DetailsAboutContainers.b_MapGenerators;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author SashaKhyzhun on 4/25/17.
 */
public class Pair<K, V> {
    public final K key;
    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

}
