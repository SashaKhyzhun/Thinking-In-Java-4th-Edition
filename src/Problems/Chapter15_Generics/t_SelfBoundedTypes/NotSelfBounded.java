package Problems.Chapter15_Generics.t_SelfBoundedTypes;

/**
 * @author SashaKhyzhun on 3/16/17. Page 570.
 * Обратите внимание: ограничение можно снять, и все по-прежнему
 * будут компилироваться, но тогда также откомпилируется и класс Е:
 */
public class NotSelfBounded<T> {
    T element;
    T get() { return element; }
    NotSelfBounded<T> set(T arg) { element = arg; return this; }
}

class A2 extends NotSelfBounded<A2> {}
class B2 extends NotSelfBounded<A2> {}

class C2 extends NotSelfBounded<C2> {
    C2 setAndGet(C2 arg) {
        //C2.super.set(arg);
        set(arg);
        return get();
    }
}

class D2 {}

// Теперь возможно:
class E2 extends NotSelfBounded<D2> {
    //D2 get() {
    //    return element; //return super.get(); //return super.element;
    //}
}

