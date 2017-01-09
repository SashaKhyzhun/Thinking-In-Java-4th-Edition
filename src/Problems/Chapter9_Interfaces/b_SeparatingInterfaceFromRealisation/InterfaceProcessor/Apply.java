package Problems.Chapter9_Interfaces.b_SeparatingInterfaceFromRealisation.InterfaceProcessor;

/**
 * Created by SashaKhyzhun on 1/9/17.
 */

// Тепер предположим, что у вы обнаружили некое семейство электронных фильтров,
// которое тоже было бы уместно использовать с методом Apply.process();


public class Apply {

    public static void process(Processor p, Object s) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

}
