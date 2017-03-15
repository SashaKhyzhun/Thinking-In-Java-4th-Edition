package Problems.Chapter15_Generics.o_Contravariance;

import Problems.Chapter15_Generics.n_Masks.*;

import java.util.List;

/**
 * @author SashaKhyzhun on 3/15/17. Page 552.
 * Контравариантность.
 * Также можно пойти другим путем и использовать ограничения супертипа.
 * В этом случае разработчик устанавливает ограничение по любому базовому классу
 * некоторого класса конструкцией <? super MyClass> или даже параметрутипу: <? super т>
 * (хотя вы не сможете задать ограничение супертипа для обобщенного параметра, то есть
 * конструкция <Т super MyClass> запрещена). Это позволяет безопасно передать типизованный
 * объект обобщенному типу. Таким образом, ограничение супертипа делает возможной запись в Collection:
 */
public class SuperTypeWildcards {

    // не смог заимпорить яблоки, потому что они доступны только в пакете
    static void writeTo(List<? super Number> apples) {
        apples.add(new Integer(2));
        apples.add(new Double(2.0));
        apples.add(new Float(2F));
    }
}
