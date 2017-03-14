package Problems.Chapter15_Generics.l_BoundarySituation;


/**
 * @author SashaKhyzhun on 3/14/17. Page 539.
 */

interface FactoryI<T> {
    T create();
}

class Foo2<T> {
    private T clazz;
    public <F extends FactoryI<T>> Foo2(F factory) {
        clazz = factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create() {
        return new Integer(0); // can use autoboxing.
    }

}

class Widget {
    public static class Factory implements FactoryI<Widget> {
        @Override
        public Widget create() {
            return new Widget();
        }
    }
}

public class FactoryConstraint {

    public static void main(String[] args) {
        // В конструктор должен передаватся класс, который наследует интерфейс.

        new Foo2<Integer>(new IntegerFactory()); // <Class> должен наследоватся от (new Class()).
        new Foo2<Widget> (new Widget.Factory());

        // Это решение - всего лишь разновидность передачи Class<T>. В обоих решениях используются фабрики;
        // просто Class<T> - встроенный объект-фабрика, а в приведенном решении фабрика создается явно.
        // Но в этом случае вы можете пользоваться преимуществами проверки на стадии компиляции.
    }

}
