package Problems.Chapter14_InfoAboutTypes.c_GenericClassRef;

/**
 * Created by SashaKhyzhun on 3/10/17. Page 461
 *
 */
public class GenericClassReferences {

    public static void main(String[] args) {
        Class intClass = int.class;

        Class<Integer> genericIntClass = int.class;

        genericIntClass = Integer.class; // to je

        intClass = double.class;

        // ! genericIntClass = double.class; недопустимо.



    }

}
