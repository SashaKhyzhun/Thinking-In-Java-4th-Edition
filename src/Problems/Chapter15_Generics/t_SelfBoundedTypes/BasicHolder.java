package Problems.Chapter15_Generics.t_SelfBoundedTypes;

/**
 * @author SashaKhyzhun on 3/16/17. Page 567.
 * Что может сделать обобщенный базовый тип при получении имени производного класса?
 * Основной смысл обобщений в Java проявляется в передаче аргументов и возвращаемых типов,
 * так что он может создать базовый класс, использующий производный тип в типах своих аргументов
 * и возвращемого значения.
 *
 * Также производный тип может использоваться для типов полей,
 * несмотря на то что они будут стерты до Object.
 * Следующий обобщенный класс выражает эту мысль:
 */
public class BasicHolder<T> {

    T element;
    void set(T element) {
        this.element = element;
    }
    T get() {
        return element;
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}





