package Problems.Chapter14_InfoAboutTypes.g_ExtractionnInfoAboutMethods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Pattern;

import static com.sun.tools.doclint.Entity.le;

/**
 * Created by SashaKhyzhun on 3/10/17. Page 481
 * Использование отражения для вывода на экран всех методов
 * класса, включая те, что были определены в базовых классах.
 */
public class ShowMethods {

    private static String usage =
              "usage:\n"
            + "ShowMethods qualified.class.name\n"
            + "To show all methods in class or:\n"
            + "ShowMethods qualified.class.name word\n"
            + "To search for methods involving 'word'";

    private static Pattern pattern = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }

        int lines = 0;
        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] constructors = c.getConstructors();

            if (args.length == 1) {
                for (Method m : methods) {
                    System.out.println(pattern.matcher(m.toString().replaceAll("", "")));
                }
                for (Constructor ctor : constructors) {
                    System.out.println(pattern.matcher(ctor.toString().replaceAll("", "")));
                }
                lines = methods.length + constructors.length;
            } else {
                for (Method method : methods) {
                    if (method.toString().indexOf(args[1]) != -1) {
                        System.out.println(pattern.matcher(method.toString().replaceAll("", "")));
                        lines++;
                    }
                }
                for (Constructor ctor : constructors) {
                    if (ctor.toString().indexOf(args[1]) != -1) {
                        System.out.println(pattern.matcher(ctor.toString().replaceAll("", "")));
                        lines++;
                    }
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Nu such class: " + e);
        }

    }

}
