package Problems.Chapter15_Generics.r_Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author SashaKhyzhun on 3/15/17.
 */
public class ByteSet {

    Byte[] possibles = { 1,2,3,4,5,6,7,8,9 };

    Set<Byte> mySet = new HashSet<Byte>(Arrays.asList(possibles));

    // Но така запись невозможна: (наверное была на старой java)
    Set<Byte> mySet2 = new HashSet<Byte>(Arrays.<Byte>asList(possibles));

}
