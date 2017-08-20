package Problems.Chapter18_InputOutputSystem.c_FileUtilities;

import java.util.Collection;

/**
 * @author SashaKhyzhun on 8/20/17. Page 730.
 * Аккуратный вывод коллекций.
 */
public class PPrint {

    public static String pformat(Collection<?> c) {
        if (c.size() == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (Object element : c) {
            if (c.size() != 1) {
                sb.append("\n   ");
            }
            sb.append(element);
        }

        if (c.size() != 1) {
            sb.append("\n");
        }

        sb.append("]");
        return sb.toString();
    }
}
