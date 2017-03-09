package Problems.Chapter13_Strings.g_RegularExpressions;

import java.util.Arrays;

/**
 * Created by SashaKhyzhun on 3/9/17.
 */
public class Splitting {

    public static String khights = "Then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree in the forest... with... a herring!";

    public static void split(String regex) {
        System.out.println(Arrays.toString(khights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");     // Выражение может не содержать специальных символов
        split("\\W+");  // Разбиение по символам, не являющимся символами слов
        split("n\\W+"); // Буква 'n', за которой следуют символы, не являющиеся символов слов
    }

}
