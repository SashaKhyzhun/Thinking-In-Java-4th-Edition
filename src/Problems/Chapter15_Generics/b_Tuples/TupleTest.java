package Problems.Chapter15_Generics.b_Tuples;

/**
 * @author SashaKhyzhun on 3/13/17. Page 506
 */

class Amphibian {}
class Vehicle  {}

public class TupleTest {

    static TwoTuple<String, Integer> f() {
        // Автомат упаковка преобразует int в Integer;
        return new TwoTuple<String, Integer>(
                "hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<Amphibian, String, Integer>(
                new Amphibian(), "hi", 47);
    }

    public static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<Vehicle, Amphibian, String, Integer>(
                new Vehicle(), new Amphibian(), "hi", 47
        );
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Boolean> k() {
        return new FiveTuple<Vehicle, Amphibian, String, Integer, Boolean>(
                new Vehicle(), new Amphibian(), "hi", 47, true
        );
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        // ! ttsi.first + "there"; // Ошбика компиляции: final
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }

}
