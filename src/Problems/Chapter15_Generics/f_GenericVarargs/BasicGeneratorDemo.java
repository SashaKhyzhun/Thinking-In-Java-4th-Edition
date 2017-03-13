package Problems.Chapter15_Generics.f_GenericVarargs;

import Problems.Chapter15_Generics.d_GenericInteface.Generator;

/**
 * @author SashaKhyzhun on 3/13/17.
 */
public class BasicGeneratorDemo {

    public static void main(String[] args) {
        Generator<CountedObject> generator = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }
    }

}
