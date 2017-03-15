package Problems.Chapter15_Generics.p_UnlimitedMasks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SashaKhyzhun on 3/15/17. Page 555
 * Неограниченые маски.
 *
 * Неограниченная маска <?> означает "что угодно", так что может показаться,
 * что использование неогранмченной маски эквивалетноно использованию самого типа.
 * Действительно, компилятор на первый взгляд соглашается с этим предположением:
 */
public class UnboundedWildcard1 {

    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;

    static void assign1(List list) {
        list1 = list;
        list2 = list;
        //list3 = list; // Предупреждение: неконтролируемое преобразование
        // Обранужен: List, требуется: List<? extends Object>.
    }

    static void assign2(List<?> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    static void assign3(List<? extends Object> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    public static void main(String[] args) {
        assign1(new ArrayList());
        assign2(new ArrayList());
        assign3(new ArrayList()); // Предупреждение: неконтролируемое преобразование
                                  // Обранужен: ArrayList, требуется: List<? extends Object>.

        assign1(new ArrayList<String>());
        assign2(new ArrayList<String>());
        assign3(new ArrayList<String>());

        // Обе формы допустимы как List<?>:
        List<?> wildList = new ArrayList();
        wildList = new ArrayList<String>();

        assign1(wildList);
        assign2(wildList);
        assign3(wildList);

        /**
         * Во многих ситуациях компилятор действительно совершенно не интересует,
         * используете ли вы сам тип или <?>. В таких случаях <?> можно рассматривать
         * как обычное украшение. Тем не менее маска все же полезна, потому что она
         * фактически говорит: <Этот код написан с учетом обобщений Java, и здесь>
         * <имеется в виду, что в обобщенном параметре может передаваться любой типя>.
         */

    }


}
