package Problems.Chapter18_InputOutputSystem.c_FileUtilities;

import java.io.File;

/**
 * @author SashaKhyzhun on 8/20/17.
 */
public class DirectoryDemo {

    public static void main(String[] args) {
        // Все каталоги
        PPrint.pformat(Directory.walk(".").dirs);
        System.out.println("--------------------------");


        // Все файлы, имена которых начинаются с 'T'
        for (File file : Directory.local(".", "T.*"))
            System.out.println(file);
        System.out.println("--------------------------");


        // Все файлы Java, имена которых начинаются с 'T'
        for (File file : Directory.walk(".", "T.*\\.java"))
            System.out.println(file);
        System.out.println("--------------------------");


        // Файлы классов, имена которых содержат 'Z' или 'z':
        for (File file : Directory.walk(".", ".*[Zz].*\\.class"))
            System.out.println(file);

    }

}
