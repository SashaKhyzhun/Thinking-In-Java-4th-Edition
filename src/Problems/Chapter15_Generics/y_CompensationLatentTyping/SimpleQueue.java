package Problems.Chapter15_Generics.y_CompensationLatentTyping;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author SashaKhyzhun on 4/7/17.
 */
public class SimpleQueue<T> implements Iterator<T> {

    private LinkedList<T> storage = new LinkedList<T>();



    public void add(T t) {
        storage.offer(t);
    }

    public T get() {
        return storage.poll();
    }

    public Iterator<T> iterator() {
        return storage.iterator();
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}

