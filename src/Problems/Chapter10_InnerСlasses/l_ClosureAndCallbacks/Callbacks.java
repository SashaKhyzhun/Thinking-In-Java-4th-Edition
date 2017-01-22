package Problems.Chapter10_InnerСlasses.l_ClosureAndCallbacks;

/**
 * Created by SashaKhyzhun on 1/22/17. Page 309.
 * Important theme. Замыкания и обратные вызовы.
 * // Использование внутренних классов для реализации обратных вызовов.
 *
 * Замыкание, предоставляемое внутренним классов, - идеальное решение;
 * гораздо более гибкое и безопасное, чем указатель. Рассмотрим пример:
 */

interface Incrementable { void increment(); }

// ПРОСТО реализуем интерфейс:
class Callee1 implements Incrementable {
    private int i = 0;
    public void increment() { i++; System.out.println(i); }
}

class MyIncrement {
    public void increment() {
        System.out.println("Другая операция");
    }
    public static void f(MyIncrement mi) { mi.increment(); }
}

// Если ваш класс должен вызывать метод increment()
// по-другому, необходимо использовать внутренний класс:
class Callee2 extends MyIncrement {
    private int i = 0;
    public void increment() {
        super.increment();
        i++; System.out.println(i);
    }
    private class Closure implements Incrementable {
        // Указывается метод внешнего класса, иначе возникнет бесконечная рекурсия
        public void increment() {
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }
    void go() {
        callbackReference.increment();
    }
}

public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1(); // класс с простой implements
        Callee2 c2 = new Callee2(); // класс с приватным классом, который implements
        MyIncrement.f(c2); // т.к. c2 extend-ит класс MyIncrement, то мы можем его юзать
        Caller caller1 = new Caller(c1); // подходит, т.к. можем взять ссылку на Incrementable
        Caller caller2 = new Caller(c2.getCallbackReference()); // та же фигня, только с помощью метода
        caller1.go(); // все ок
        caller1.go(); // все ок
        caller2.go(); // все ок
        caller2.go(); // все ок
    }
}