package Problems.Chapter17_DetailsAboutContainers.p_FailFastMachine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 * @author SashaKhyzhun on 8/8/17.
 */
public class FailFast {

    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();
        Iterator<String> it = c.iterator();
        c.add("An Object");
        try {
            String s = it.next();
        } catch (ConcurrentModificationException e) {
            System.out.println(e.toString());
        }


    }

}
