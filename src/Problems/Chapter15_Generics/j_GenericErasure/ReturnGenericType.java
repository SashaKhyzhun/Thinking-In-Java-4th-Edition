package Problems.Chapter15_Generics.j_GenericErasure;

/**
 * @author SashaKhyzhun on 3/14/17. Page 530.
 * В результатке параметры-типа и их применение в практическом
 * обобщенному коде обычно сложнее просто замены класса.
 * Впрочем, это не значит, что любая конструкция вида
 * <T extends HasF> бесполезна. Например, если класс содержит
 * метод, который возвращает T, обобщения приносят пользу,
 * потому что они возвращают точный тип:
 */
public class ReturnGenericType<T extends HasF> {

    private T object;

    public ReturnGenericType(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
} ///:~
