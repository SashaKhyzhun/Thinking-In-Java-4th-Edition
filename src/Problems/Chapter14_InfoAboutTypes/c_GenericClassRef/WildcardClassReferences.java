package Problems.Chapter14_InfoAboutTypes.c_GenericClassRef;

/**
 * Created by SashaKhyzhun on 3/10/17.
 */
public class WildcardClassReferences {

    public static void main(String[] args) {

        Class<?> intClass = int.class;
        intClass = double.class;

    }

}
