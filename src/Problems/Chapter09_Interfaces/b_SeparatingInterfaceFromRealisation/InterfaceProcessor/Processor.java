package Problems.Chapter09_Interfaces.b_SeparatingInterfaceFromRealisation.InterfaceProcessor;

/**
 * Created by SashaKhyzhun on 1/9/17.
 */
public interface Processor {
    String name();
    Object process(Object input);
} // ...
