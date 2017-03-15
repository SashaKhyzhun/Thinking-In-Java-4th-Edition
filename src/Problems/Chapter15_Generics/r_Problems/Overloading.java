package Problems.Chapter15_Generics.r_Problems;

import java.util.List;

/**
 * @author SashaKhyzhun on 3/15/17. Page 566.
 * Перегрузака метода порождает идентичную сигнтуру типа из-за стирания.
 */
public class Overloading<W, T> {
    //void f(List<T> v) {}
    //void f(List<W> v) {} // <-- так нельзя
}

class CorrectOverloading<W, T> {
    void f(List<T> v) {}
    void g(List<W> v) {} // <-- так льзя.
}
