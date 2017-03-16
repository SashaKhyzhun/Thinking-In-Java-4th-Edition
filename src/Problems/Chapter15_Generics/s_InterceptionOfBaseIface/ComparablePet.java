package Problems.Chapter15_Generics.s_InterceptionOfBaseIface;

/**
 * @author SashaKhyzhun on 3/15/17. Page 566.
 * Interception of the interface by the base class
 * Перехват интерфейса базовым классом
 */
public class ComparablePet implements Comparable<ComparablePet> {

    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }

}
