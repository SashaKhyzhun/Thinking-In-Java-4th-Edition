package Problems.Chapter13_Strings.g_RegularExpressions;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 431
 */
public class Replacing {

    static String s = Splitting.khights;

    public static void main(String[] args) {
        System.out.println(s.replaceFirst("f\\w+", "located"));

        System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
    }

}
