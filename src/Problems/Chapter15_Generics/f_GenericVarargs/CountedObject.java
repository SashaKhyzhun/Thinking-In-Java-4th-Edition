package Problems.Chapter15_Generics.f_GenericVarargs;

/**
 * @author SashaKhyzhun on 3/13/17. Page 517
 */
public class CountedObject {

    private static long counter = 0;
    private final long id = counter++;

    public long id() { return id; }
    public String toString() { return "CountedObject " + id; }

}
