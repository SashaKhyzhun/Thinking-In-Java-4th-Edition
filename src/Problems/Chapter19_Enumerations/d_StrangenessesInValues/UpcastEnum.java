package Problems.Chapter19_Enumerations.d_StrangenessesInValues;

/**
 * @author SashaKhyzhun on 8/28/17.
 * Page 818.
 */

enum Search {
    HITLER, YON
}

public class UpcastEnum {

    public static void main(String[] args) {
        Search[] vals = Search.values();
        Enum e = Search.HITLER; // Восходящее преобразование
        // e.values();          // Enum не содержит метода values()
        for (Enum en : e.getClass().getEnumConstants()) {
            System.out.println(en);
        }
    }

}
