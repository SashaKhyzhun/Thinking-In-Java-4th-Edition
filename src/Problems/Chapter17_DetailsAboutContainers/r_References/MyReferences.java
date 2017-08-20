package Problems.Chapter17_DetailsAboutContainers.r_References;

import java.lang.ref.*;
import java.util.LinkedList;

/**
 * @author SashaKhyzhun on 8/8/17. Page 714.
 *
 * Классы SoftReference, WeakReference и PhantomReference «располагаются» по порядку:
 * каждый следующий "слабее", чем предыдущий, и отвечает за свой уровень достижимости.
 *
 * Класс SoftReference предназначен для реализации буферов памяти.
 *
 * Класс WeakReference необходим при реализации «канонического отображения», где экземпляры объектов
 *                     могут одновременно использоваться в различных местах программы, для экономии
 *                     памяти, что не предотвращает освобождения ключей (или значений).
 *
 * Класс PhantomReference предназначен для планирования "предсмертных" действий объекта
 *                        и позволяет осуществить их более гибкими способами в сравнении
 *                        со стандартным механизмом финализации Java.
 *
 * Для SoftReference и WeakReference у вас есть выбор - помещать или не помещать их во
 * вспомогательный класс ReferenceQueue (механизм "предсмертной" очистки объекта),
 * однако создание PhantomReference возможно только в объекте ReferenceQueue.
 *
 * Вот простой пример:
 */

class VeryBig {
    private static final int SIZE = 10000;
    private long[] la = new long[SIZE];
    private String ident;

    public VeryBig(String id) {
        ident = id;
    }
    public String toString() { return ident; }
    protected void finalize() throws Throwable {
        System.out.println("Finalizing " + ident);
    }
}
public class MyReferences {

    private static ReferenceQueue<VeryBig> rq = new ReferenceQueue<>();

    public static void checkQueue() {
        Reference<? extends VeryBig> inq = rq.poll();
        if (inq != null) {
            System.out.println("In queue: " + inq.get());
        }
    }

    public static void main(String[] args) {
        int size = 10;
        // Или использовать размер, заданный в командной строке:
        if (args.length > 0) {
            size = new Integer(args[0]);
        }

        LinkedList<SoftReference<VeryBig>> sa = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            sa.add(new SoftReference<VeryBig>(new VeryBig("Soft " + i), rq));
            System.out.println("Just created: " + sa.getLast());
            checkQueue();
        }



        LinkedList<WeakReference<VeryBig>> wa = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            wa.add(new WeakReference<VeryBig>(new VeryBig("Weak " + i), rq));
            System.out.println("Just created: " + wa.getLast());
            checkQueue();
        }


        LinkedList<PhantomReference<VeryBig>> pa = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            pa.add(new PhantomReference<VeryBig>(new VeryBig("Phantom " + i), rq));
            System.out.println("Just created: " + pa.getLast());
            checkQueue();
        }

    }

}
