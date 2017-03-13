package Problems.Chapter15_Generics.f_GenericVarargs;

import Problems.Chapter15_Generics.b_Tuples.FiveTuple;
import Problems.Chapter15_Generics.b_Tuples.FourTuple;
import Problems.Chapter15_Generics.b_Tuples.ThreeTuple;
import Problems.Chapter15_Generics.b_Tuples.TwoTuple;

import static Problems.Chapter15_Generics.f_GenericVarargs.TuplesEasy.tuple;

/**
 * @author SashaKhyzhun on 3/13/17.
 */
class Amphibian {}
class Vehicle  {}

public class TupleTest2 {

    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }
    static TwoTuple f2() {
        return tuple("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Boolean> k() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47, true);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
