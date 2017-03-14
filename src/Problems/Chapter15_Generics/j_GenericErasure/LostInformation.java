package Problems.Chapter15_Generics.j_GenericErasure;

import java.util.*;

/**
 * @author SashaKhyzhun on 3/14/17. Page 527.
 * Итак, жесткая правда:
 * ---> (!) в обобщенном коде информация о параметрах-типах обобщения недоступна. ;(
 */


class Frob {}
class Fnorkle {}
class Quark<Q> {}
class Particle<POSITION, MOMENTUM> {}

public class LostInformation {

    public static void main(String[] args) {
        List<Frob> list = new ArrayList<Frob>();

        Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();

        Quark<Fnorkle> quark = new Quark<Fnorkle>();

        Particle<Long, Double> paricle = new Particle<Long, Double>();

        System.out.println(Arrays.toString(list   .getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map    .getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark  .getClass().getTypeParameters()));
        System.out.println(Arrays.toString(paricle.getClass().getTypeParameters()));


    }

}
