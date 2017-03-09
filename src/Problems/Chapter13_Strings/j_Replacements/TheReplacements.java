package Problems.Chapter13_Strings.j_Replacements;

import com.sun.codemodel.internal.fmt.JTextFile;

import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by SashaKhyzhun on 3/10/17.
 */

public class TheReplacements {

    /*! Here's a block of text to use as input to the regular expression matcher.
        Note that we'll first extract the block of text by looking for the special
        delimiters, then process the extracted block !*/

    public static void main(String[] args) throws Exception {
        JTextFile textFile = new JTextFile("TheReplacements.java");
        String s = textFile.name();

        Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
        if (mInput.find()) {
            s = mInput.group(1); // Совпадение водвыражения в круглых скобках
        }

        // Два и более пробела заменяются одним:
        s = s.replaceAll(" {2,}", " ");

        // Один и более пробелов в начале строки заменяется пустой строкой.
        // Для выполнения должен быть активен режим MULTILINE:
        s = s.replaceAll("(?m)^ +", "");
        System.out.println(s);
        s = s.replaceFirst("[aeiou]", "(VOWEL1)");

        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);

        // Обработака информации find при выполнении замены:
        while (m.find()) {
            m.appendReplacement(sbuf, m.group().toUpperCase());
        }
        // Присоединение оставшегося текста:
        m.appendTail(sbuf);
        System.out.println(sbuf);
    }

}
