package Problems.Chapter11_Collections.a_GenericTypesAndClasses;

import java.util.ArrayList;

/**
 * Created by SashaKhyzhun on 2/8/17. Page 326.
 * Восходящее преобразование работает с обобщенными типами
 * точно так же, как и с любыми другими типами.
 */

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}

public class GenericsAndUpcasting {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for (Apple c : apples) {
            System.out.println(c);
        }

    }


    /**
     * Таким образом в контейнер для объектов Apple
     * можно поместить объект одного из субтипов Apple
     */

}
