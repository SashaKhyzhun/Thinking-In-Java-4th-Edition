package Problems.Chapter13_Strings.i_Flags;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by SashaKhyzhun on 3/9/17.
 */
public class SplitDemo {

    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";

        System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));

        // only do the first three:
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3)));
        //ограничивает количество выполняемых разбиений.

    }

}
