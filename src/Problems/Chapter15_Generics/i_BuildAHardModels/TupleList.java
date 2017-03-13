package Problems.Chapter15_Generics.i_BuildAHardModels;

import Problems.Chapter15_Generics.b_Tuples.FourTuple;
import Problems.Chapter15_Generics.b_Tuples.TupleTest;

import java.util.ArrayList;

/**
 * @author SashaKhyzhun on 3/13/17.
 */
class Vehicle {}
class Amphibian {}
public class TupleList<A, B, C, D> extends ArrayList<FourTuple<A, B, C, D>> {

    public static void main(String[] args) {
        TupleList<Vehicle, Amphibian, String, Integer> t1 =
                new TupleList<Vehicle, Amphibian, String, Integer>();

        //t1.add(TupleTest.h());
        //t1.add(TupleTest.h());

        for (FourTuple<Vehicle, Amphibian, String, Integer> i : t1) {
            System.out.println(i);
        }
    }




}
