package Problems.Chapter15_Generics.t_SelfBoundedTypes;

/**
 * @author SashaKhyzhun on 3/16/17. Page 569.
 * Самоограничение.
 * Самоограничение делает следующий шаг: оно заставляет обобщение
 * использовать самого себя в качестве аргумента ограничения.
 * Посмотрим, как может (и не может) использоваться полученный класс:
 */

class SelfBounded2<T extends SelfBounded2<T>> {

    T element;

    SelfBounded2<T> set(T arg) {
        element = arg;
        return this; // ?
    }

    T get() {
        return element;
    }

}

class A extends SelfBounded2<A> {}
class B extends SelfBounded2<A> {} // также допустимо

class C extends SelfBounded2<C> {
    C setAndGet(C arg) { set(arg); return get(); }
}

class D {}

// class E extends SelfBounded2<D> {} // не допустимо
// Ошибка компиляции: параметр-тип D не соответствует ограничению

// Увы, это возможно, так что принудить к выполению идиомы не удастся:
class F extends SelfBounded2 {}

public class SelfBounding {
    public static void main(String[] args) {
        A a = new A();
        a.set(new A());

        a = a.set(new A()).get();
        a = a.get();

        C c = new C();
        c = c.setAndGet(new C());
    }

    /**
     * Какую пользу приносит самоограничение? Параметр-тип должен совпадать с определяемым классом.
     * Как видно из определения класса B, также возможно наследование от SelfBounded, в параметре
     * которого снова используется SelfBounded, хотя на практике обычно преобладает использование,
     * продемонстрированное для класса А. Попытка определить Е показывает, что вы не можете использовать
     * параметр-тип, который не является SelfBounded.
     *
     * К сожалению, код F компилируется без предупреждений, так что идиома самоограни-чения не является
     * обязательной к исполнению. Если для вас это так важно, возможно, вам придется использовать внешние
     * инструменты, которые будут убеждаться в том, что неспециализированные типы не используются вместо
     * параметризованных типов.
     */

}
