package Problems.Chapter15_Generics.j_GenericErasure;

import java.util.ArrayList;

/**
 * @author SashaKhyzhun on 3/14/17. Page 526
 * Houston...
 */
public class ErasedTypeEquivalence {

    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();

        System.out.println(c1 == c2);
    }
}
