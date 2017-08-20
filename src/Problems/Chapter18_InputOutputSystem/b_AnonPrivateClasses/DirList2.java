package Problems.Chapter18_InputOutputSystem.b_AnonPrivateClasses;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author SashaKhyzhun on 8/20/17. Page 726.
 */
public class DirList2 {

    public static FilenameFilter filter(final String regex) {
        // Создание ананомного внутреннего класса:
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        }; // Конец анонимного внутреннего класса
    }


    public static void main(String[] args) {
        File path = new File("src/Problems");
        String[] list;
        if (args.length == 0)
            list = path.list();
        else
            list = path.list(filter(args[0]));

        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            System.out.println(dirItem);

    }


}
