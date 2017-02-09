package Problems.Chapter11_Collections.a_GenericTypesAndClasses;

import java.util.ArrayList;

/**
 * Created by SashaKhyzhun on 2/8/17. Page 325
 */
public class ApplesAndOrangesWithGenerics {

    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // Ошибка во время компиляции:
        // apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        // те же яйца только в профиль
        for (Apple c : apples) {
            System.out.println(c.id());
        }


    }

}
