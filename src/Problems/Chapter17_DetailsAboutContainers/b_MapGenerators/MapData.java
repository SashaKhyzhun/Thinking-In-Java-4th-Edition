package Problems.Chapter17_DetailsAboutContainers.b_MapGenerators;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;

import java.util.LinkedHashMap;

/**
 * @author SashaKhyzhun on 4/25/17. Page 640.
 * Заполнение данными Map с использованием объекта генератора.
 */
public class MapData<K, V> extends LinkedHashMap<K, V> {

    // Один генератор Pair:
    public MapData(Generator<Pair<K, V>> generator, int quantity) {
        for (int i = 0; i < quantity; i++) {
            Pair<K, V> p = generator.next();
            put(p.key, p.value);
        }
    }

    // Два разных генератора:
    public MapData(Generator<K> generatorK, Generator<V> generatorV, int quantity) {
        for (int i = 0; i < quantity; i++) {
            put(generatorK.next(), generatorV.next());
        }
    }

    // Генератор ключа и одно значение:
    public MapData(Generator<K> generatorK, V value, int quantity) {
        for (int i = 0; i < quantity; i++) {
            put(generatorK.next(), value);
        }
    }

    // Iterable и генератор значения:
    public MapData(Iterable<K> iterableK, Generator<V> generatorV) {
        for (K key : iterableK) {
            put(key, generatorV.next());
        }
    }

    // Iterable и одно значение:
    public MapData(Iterable<K> iterableK, V value) {
        for (K key : iterableK)
            put(key, value);
    }

    // Обощенные вспомагательные методы:
    public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> generator, int quantity) {
        return new MapData<K, V>(generator, quantity);
    }

    public static <K, V> MapData<K, V> map(Generator<K> generatorK, Generator<V> generatorV, int quantity) {
        return new MapData<K, V>(generatorK, generatorV, quantity);
    }

    public static <K, V> MapData<K, V> map(Generator<K> generatorK, V value, int quantity) {
        return new MapData<K, V>(generatorK, value, quantity);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> iterableK, Generator<V> generatorV) {
        return new MapData<K, V>(iterableK, generatorV);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> iterableK, V value) {
        return new MapData<K, V>(iterableK, value);
    }


}
