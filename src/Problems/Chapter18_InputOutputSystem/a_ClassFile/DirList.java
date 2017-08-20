package Problems.Chapter18_InputOutputSystem.a_ClassFile;

import java.io.File;
import java.util.Arrays;

/**
 * @author SashaKhyzhun on 8/20/17. Page 724.
 * Вывод содержимого каталога с использованием регулярных выражений.
 */
public class DirList {

    public static void main(String[] args) {

        File path = new File(".");
        String[] list;
        if (args.length == 0)
            list = path.list();
        else
            list = path.list(new DirFilter(args[0]));

        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            System.out.println(dirItem);


    }

}
