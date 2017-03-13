package Problems.Chapter15_Generics.b_Tuples;

/**
 * @author SashaKhyzhun on 3/13/17.
 */
public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {

    public final E fifth;

    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        fifth = e;
    }


    public String toString() {
        return "("
                + first  + ", "
                + second + ", "
                + third  + ", "
                + fourth + ", "
                + fifth + ")";
    }

}
