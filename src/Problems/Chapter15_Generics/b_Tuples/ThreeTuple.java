package Problems.Chapter15_Generics.b_Tuples;

/**
 * @author SashaKhyzhun on 3/13/17. Page 505
 */
public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {

    public final C third;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }

    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }
}


