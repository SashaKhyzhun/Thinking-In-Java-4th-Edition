package Problems.Chapter17_DetailsAboutContainers.k_OverridingHashCode;

/**
 * @author SashaKhyzhun on 7/12/17.
 */
public class StringHashCode {

    public static void main(String[] args) {
        String[] hellos = "Hello Hello".split(" ");
        System.out.println(hellos[0].hashCode());
        System.out.println(hellos[1].hashCode());
    }

}
