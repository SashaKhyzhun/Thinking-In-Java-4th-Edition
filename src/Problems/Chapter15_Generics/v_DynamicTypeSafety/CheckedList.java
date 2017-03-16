package Problems.Chapter15_Generics.v_DynamicTypeSafety;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author SashaKhyzhun on 3/16/17. Page 574.
 * Динамическая безопасность типов.
 *
 */

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}


public class CheckedList {

    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyDogs) {
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<Dog>();
        oldStyleMethod(dogs1); // Принимает Cat без возражений

        List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(), Dog.class);

        try {
            oldStyleMethod(dogs2); // Возбуждает исключение
        } catch (Exception e) {
            System.out.println(e);
        }

        // Производные типа работают нормально:
        List<Animal> animals = Collections.checkedList(new ArrayList<Animal>(), Animal.class);
        animals.add(new Cat());
        animals.add(new Dog());
    }

}
