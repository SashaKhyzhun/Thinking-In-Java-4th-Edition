package Problems.Chapter14_InfoAboutTypes.e_RecursiveCounter;

/**
 * Created by SashaKhyzhun on 3/10/17.
 */
public class PetCount4 {

    public static void main(String[] args) {

        TypeCounter typeCounter = new TypeCounter(StringBuilder.class);

        for (String s : "My dog has fleas qwe mnb".split(" ")) {
            System.out.println(s.getClass().getSimpleName() + " ");
            typeCounter.count(s);
        }
        System.out.println();

        System.out.print(typeCounter);

    }

}
