package Problems.Chapter15_Generics.a_SimpleGenerics;

/**
 * @author SashaKhyzhun on 3/13/17.
 */

class Pair<T1, T2> {

    T1 intObj;
    T2 stringObj;

    public Pair(T1 intObj, T2 stringObj) {
        this.intObj = intObj;
        this.stringObj = stringObj;
    }

    public T1 getIntObj() {
        return intObj;
    }

    public T2 getStringObj() {
        return stringObj;
    }
}

public class DoubleGeneric {

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<Integer, String>(2, "Two");
        System.out.println(pair.getIntObj() + " " + pair.getStringObj());
    }
}
