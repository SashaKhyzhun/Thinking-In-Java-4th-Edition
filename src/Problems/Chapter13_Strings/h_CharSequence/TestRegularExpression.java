package Problems.Chapter13_Strings.h_CharSequence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 435.
 * В общем случае следует компилировать объекты регулярных выражений вместо того,
 * чтобы использовать ограниченные возможности String. Для этого импортируйте
 * java.unit.regex, а затем откомпилируйте регулярное выражение статическим методом
 * Pattern.compile(). В результате на базе аргумента String создается объект Pattern;
 * чтобы использовать этот объект, вызовите его метод matcher() и передайте строку, в
 * которой ведется поиск.
 */


// Класс для простого тестирования регулярных выражений.
// {Args: abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}" }

public class TestRegularExpression {

    public static void main(String[] args) {
        args = new String[]{"abcabcabcdefabc", "abc+", "(abc)+", "(abc){2,}"};

        if (args.length < 2) {
            System.out.println("Usage:\njava TestRegularExpression characterSequence regularExpression");
            System.exit(0);
        }

        System.out.println("Input: \"" + args[0] + "\"");
        for (String arg : args) {
            System.out.println("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
            }

        }


    }


}
