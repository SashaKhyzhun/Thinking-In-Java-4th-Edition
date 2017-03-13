package Problems.Chapter15_Generics.f_GenericVarargs;

import Problems.Chapter15_Generics.b_Tuples.FiveTuple;
import Problems.Chapter15_Generics.b_Tuples.FourTuple;
import Problems.Chapter15_Generics.b_Tuples.ThreeTuple;
import Problems.Chapter15_Generics.b_Tuples.TwoTuple;

/**
 * @author SashaKhyzhun on 3/13/17. Page 518.
 * УПРОЩЕНИЕ ИСПОЛЬЗОВАНИЕ КОРТЕЖЕЙ
 */

// Библиотека кортежей с использованием автоматического
// определения аргументов-типов
public class TuplesEasy {

    public static <A, B> TwoTuple<A,B> tuple(A a, B b) {
        return new TwoTuple<A, B>(a, b);
    }

    public static <A, B, C> ThreeTuple<A, B, C> tuple(A a, B b, C c) {
        return new ThreeTuple<A, B, C>(a, b, c);
    }

    public static <A, B, C, D> FourTuple<A, B, C, D> tuple(A a, B b, C c, D d) {
        return new FourTuple<A, B, C, D>(a, b, c, d);
    }

    public static <A, B, C, D, E> FiveTuple<A, B, C, D, E> tuple(A a, B b, C c, D d, E e) {
        return new FiveTuple<A, B, C, D, E>(a, b, c, d, e);
    }

}
