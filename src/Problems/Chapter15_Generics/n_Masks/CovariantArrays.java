package Problems.Chapter15_Generics.n_Masks;

/**
 * @author SashaKhyzhun on 3/15/17. Page 548.
 * Маски.
 * Если фактическим типом массива является Apple[], то в массив могут помещаться
 * только объекты типа Apple или типов, производных от Apple, что фактически работает
 * как во время компиляции, так и о время выполнения. Но компилятор позволяет поместить
 * объект Fruit или Orange в массив. Для компилятора это выглядит логично, потому что он
 * работает со ссылкой Fruit[].
 */

class Fruit {}

class Apple extends Fruit {}
class GoldenApple extends Apple {}
class RedApple extends Apple {}

class Orange extends Fruit {}



public class CovariantArrays {

    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10]; // присваивание одного массива другому
        fruit[0] = new Apple();        // OK, потому что разновидность яблок
        fruit[1] = new GoldenApple();  // OK, потому что разновидность яблок
        fruit[2] = new RedApple();     // OK, потому что разновидность яблок

        // Тип времени выполнения - Apple[], а не Fruit[] и не Orange[]:
        try {
            // Компилятор позволяет добавить Fruit:
            fruit[0] = new Fruit(); // ArrayStoreException
        } catch (Exception e) { System.out.println(e); }

        try {
            // Компилятор позволяет добавлять Orange:
            fruit[0] = new Orange(); // ArrayStoreException
        } catch (Exception e) { System.out.println(e); }

    }

}
