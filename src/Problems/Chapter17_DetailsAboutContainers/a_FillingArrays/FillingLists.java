package Problems.Chapter17_DetailsAboutContainers.a_FillingArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author SashaKhyzhun on 4/24/17. Page 638.
 * Заполнение контейнеров.
 *
 */


class StringAddress {
    private String s;
    public StringAddress(String s) {
        this.s = s;
    }
    @Override public String toString() {
        return super.toString() + " " + s;
    }
}

public class FillingLists {

    public static void main(String[] args) {

        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);

        Collections.fill(list, new StringAddress("World!"));
        System.out.println(list);

    }

}
