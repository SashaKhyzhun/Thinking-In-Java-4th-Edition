package Problems.Chapter13_Strings.c_UnintentionalRecursion;

import java.util.*;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 419
 * Непреднамеренная рекурсия.
 *
 * метод ArrayList.toSting() перебирает элементы ArrayList и
 * вызывает для каждого элемента toString():
 */
public class ArrayListDisplay {

    public static void main(String[] args) {
        ArrayList<String> coffees = new ArrayList<>();
        ArrayList<String> coffeeCollection = new ArrayList<String>();
        coffeeCollection.add("Americano");
        coffeeCollection.add("Latte");
        coffeeCollection.add("Mocha");
        coffeeCollection.add("Cappuccino");
        coffees.addAll(coffeeCollection);

        for (String c : coffees) {
            System.out.println(c);
        }

        // bread...
    }


}
