package Problems.Chapter17_DetailsAboutContainers.k_OverridingHashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SashaKhyzhun on 7/12/17.
 */
public class CountedString {
    private static List<String> created = new ArrayList<>();
    private String s;
    private int id = 0;

    public CountedString(String s) {
        this.s = s;
        created.add(s);
        // id - общее количество экземпляров даной строки,
        // используемых классом CountedString:
        for (String s2 : created) {
            if (s2.equals(s))
                id++;
        }
    }

    @Override
    public String toString() {
        return "String: " + s + " id: " + id + " hashCode(): " + hashCode();
    }

    @Override
    public int hashCode() {
        // Очень простая схема:
        // вернуть s.hashCode() * id
        // по рецепту Джошуа Блоша:
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CountedString
                && s.equals(((CountedString)obj).s)
                && id == ((CountedString)obj).id;
    }

    public static void main(String[] args) {
        Map<CountedString, Integer> map = new HashMap<CountedString, Integer>();
        CountedString[] cs = new CountedString[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString("hi");
            map.put(cs[i], i); // Упаковка int -> Integer
        }
        System.out.println(map);
        for (CountedString countedString : cs) {
            System.out.println("Looking up " + countedString);
            System.out.println("bI: " + map.get(countedString));
        }
    }

}
