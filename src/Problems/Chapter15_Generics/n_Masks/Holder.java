package Problems.Chapter15_Generics.n_Masks;

/**
 * @author SashaKhyzhun on 3/15/17. PAge 552.
 * у contains() и indexof() аргументы относятся к типу Object, так что маски
 * не задействованы и компиляторы разрешают вызов. Это означает, что проектировщик
 * обобщенного класса сам решает, какие вызовы "безопасны", и использует типы ОЬ1есt
 * для их аргументов.
 *
 * Чтобы запретить вызов при использовании типа с масками, используйте параметр-тип
 * в списке аргументов. Для примера рассмотрим очень простой класс Но1ег:
 */
public class Holder<T> {
    private T value;
    public Holder() {}
    public Holder(T val) { value = val; }
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<Apple>(new Apple());

        Apple d = apple.get();
        apple.set(d);

      //Holder<Fruit> fruit = apple; // не может выполнить восходящее преобразование
        Holder<? extends Fruit> fruit = apple; // OK :)

        d = (Apple)fruit.get(); // Возвращает Object

        try {
            Orange c = (Orange)fruit.get(); // Без предупреждений
        } catch (Exception e) { System.out.println(e); }

        //fruit.set(new Apple()); // вызов set() невозможен
        //fruit.set(new Fruit()); // вызов set() невозможен
        System.out.println(fruit.equals(d)); // OK

        /**
         * Класс Holder содержит метод set(), который получает T;
         * метод get(), который получает T,
         * и метод equals(), который получает Object.
         *
         * Как вы уже видели, при создании объекта Holder<Арр1е> вы не сможете выполнить
         * его восходящее преобразование в Holder<Fruit>,
         *
         * Но можно повысить до Holder<? extends Fruit>.
         * Если вызвать get(), метод вернет Fruit — это максимальная информация, которой
         * он располагает при наличии ограничения «любой класс, расширяющий Fruit».
         *
         * Если у вас больше информации, вы можете преобразовать его к конкретному подтипу
         * Fruit без выдачи предупреждений, но возникает исключение C1assCastException.
         *
         * Метод set() не будет работать с Apple или Fruit, потому что аргумент set() тоже
         * объявлен как <? Extends Fruit>; это означает, что им может быть что угодно, а
         * компилятор не может проверить безопасность типов для «чего угодно».
         *
         * Однако метод equals() работает нормально, потому что он получает аргумент Object вместо Т.
         * Таким образом, компилятор только обращает внимание на типы передаваемых и возвращаемых объектов.
         * Он не анализирует код, чтобы проверить, выполняются ли в нем фактические операции чтения или записи.
         */

    }

}
