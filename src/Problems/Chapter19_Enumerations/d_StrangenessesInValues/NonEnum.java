package Problems.Chapter19_Enumerations.d_StrangenessesInValues;

/**
 * @author SashaKhyzhun on 8/28/17.
 * Page 818.
 */
public class NonEnum {

    public static void main(String[] args) {
        Class<Integer> intClass = Integer.class;
        try {
            for (Object en : intClass.getEnumConstants()) {
                System.out.println(en);
            }
        } catch (Exception e) {
            System.out.println("Lol, Kek, Chebyrek");
            System.out.println(e);
        }
    }

}
