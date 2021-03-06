package Problems.Chapter15_Generics.n_Masks;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SashaKhyzhun on 3/15/17. Page 550.
 * Настоящая проблема заключается в том, что речь идет о типе контейнера,
 * а не о типе элементов, хранящихся в контейнере. В отличие от массивов
 * обобщения не обладают встроенной ковариантностью. Это связано с тем, что
 * массивы полностью определяются в языке, а следовательно, для них реализованы
 * встроенные проверки как на стадии компиляции, так и на стадии выполнения,
 * тогда как с обобщениями компилятор и исполнительная система не знают, что вы
 * хотите делать со своими типами и какие при этом должны использоваться правила.
 *
 * Однако в некоторых ситуациях между двумя типами желательно установить некую разновидность
 * отношений восходящего преобразования. Для этой цели и используються маски (WildCards).
 */
public class GenericsAndCovariance {

    public static void main(String[] args) {
        // List<Fruit> a = new ArrayList<Apple>(); // так нельзя.

        // Маски обеспечивабт ковариантность:
        List<? extends Fruit> fruitsList = new ArrayList<Apple>();
        // Ошибка компиляции: добавление объектов невозможно:
        //fruitsList.add(new Apple());  // нельзя
        //fruitsList.add(new Fruit());  // нельзя
        //fruitsList.add(new Object()); // нельзя

        fruitsList.add(null); // допустимо, но неистересно
        // Мы знает, что возвращается как минимум Fruit:
        Fruit f = fruitsList.get(0);
        //Apple a = fruitsList.get(0); нельзя
    }

    /**
     * Теперь fruitsList имеет тип List<? extends Fruit>, что можно прочитать как
     * "список с элементами любого типа, производного от Fruit". Однако это не означает,
     * что в fruitsList можно будет хранить любые виды Fruit. Маска относится к определенному
     * типу, так что это означает "некоторый конкретный тип, не указанный для ссылки fruitList".
     * Итак, присваиваемый объект List должен содержать некоторый указанный тип (например, Fruit
     * или Арр1е), но для восходящего преобразования к fruitsList этот тип несущественен.
     *
     * Кто-то скажет, что это уже перебор, потому что теперь мы не можем даже добавить Apple в
     * контейнер List, в котором, как только что было сказано, будут храниться объекты Арр1е.
     *
     * Да, но ведь компилятор этого не знает! List<? extends Fruit> может на законных основаниях
     * указывать на List<orange>. После такого «восходящего преобразования» теряется способность
     * передачи чего-либо, даже object.
     */

}
