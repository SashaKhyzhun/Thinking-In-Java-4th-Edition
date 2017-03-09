package Problems.Chapter13_Strings.j_Replacements;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SashaKhyzhun on 3/10/17. Page 444
 */
public class Resetting {

    public static void main(String[] args) {
        Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
        System.out.println();

        m.reset("fix the rig with rags");
        while (m.find()) {
            System.out.print(m.group() + " ");
        }
    }

}
