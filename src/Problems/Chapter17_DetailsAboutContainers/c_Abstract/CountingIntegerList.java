package Problems.Chapter17_DetailsAboutContainers.c_Abstract;

import java.util.AbstractList;

/**
 * @author SashaKhyzhun on 5/12/17. Page 649.
 * Список произвольно длины, содержащий тестовые данные.
 */
public class CountingIntegerList extends AbstractList<Integer> {

    private int size;

    public CountingIntegerList(int size) {
        this.size = size < 0 ? 0 : size;
    }

    @Override
    public Integer get(int index) {
        return index;
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new CountingIntegerList(30));
    }

}
