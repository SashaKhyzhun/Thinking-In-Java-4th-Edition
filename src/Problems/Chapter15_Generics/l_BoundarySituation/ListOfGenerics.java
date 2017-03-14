package Problems.Chapter15_Generics.l_BoundarySituation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SashaKhyzhun on 3/14/17. Page 541.
 * Как было показано в Erased.java, создать массив обобщений невозможно.
 * Как правило, проблема решается использованием ArrayList везде, где
 * возникает потребность в создании массива обобщений:
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>(); // <---
    public void add(T item) { array.add(item); }
    public T get(int index) { return array.get(index); }
} ///:~
