package Problems.Chapter13_Strings.i_Flags;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 441
 */
public class ReFlags {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE|Pattern.MULTILINE);

        Matcher m = p.matcher("java has regex\n" +
                                    "Java has regex\n" +
                                    "JAVA has regex\n" +
                                    "Regex in Java");

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
