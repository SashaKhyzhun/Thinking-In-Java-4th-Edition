package Problems.Chapter13_Strings.g_RegularExpressions;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 430.
 */
public class IntegerMatch {

    public static void main(String[] args) {

        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));

    }
}
