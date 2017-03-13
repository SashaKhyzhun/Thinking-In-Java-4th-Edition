package Problems.Chapter15_Generics.d_GenericInteface;

/**
 * @author SashaKhyzhun on 3/13/17. PAge 509
 */
public class Coffee {

    private static long counter = 0;

    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }

}
