package Problems.Chapter14_InfoAboutTypes.c_GenericClassRef;

/**
 * Created by SashaKhyzhun on 3/10/17.
 */
public class BoundedClassReferences {

    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;

        bounded = double.class;
        bounded = Number.class;
        // или любой класс, производный от Numbers.

        // ! bounded = String.class; низя.


    }
}
